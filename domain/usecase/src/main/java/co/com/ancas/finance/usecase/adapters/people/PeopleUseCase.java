package co.com.ancas.finance.usecase.adapters.people;

import co.com.ancas.finance.model.exceptions.BadRequestException;
import co.com.ancas.finance.model.people.PeopleModel;
import co.com.ancas.finance.model.people.gateways.PeopleRepositoryPort;
import co.com.ancas.finance.usecase.ports.people.PeoplePort;
import reactor.core.publisher.Mono;

import static co.com.ancas.finance.model.enums.ErrorMessages.ERROR_MESSAGE_DNI_ALREADY_EXISTS;

public class PeopleUseCase implements PeoplePort {
    private final PeopleRepositoryPort peopleRepositoryPort;

    public PeopleUseCase(PeopleRepositoryPort peopleRepositoryPort) {
        this.peopleRepositoryPort = peopleRepositoryPort;
    }

    @Override
    public Mono<PeopleModel> createPeople(PeopleModel peopleModel) {
        return this.peopleRepositoryPort.verifyDniExists(peopleModel.getDni())
                .filter(exists->!exists)
                .switchIfEmpty(Mono.error(new BadRequestException(ERROR_MESSAGE_DNI_ALREADY_EXISTS.getMessage().formatted(peopleModel.getDni()))))
                .flatMap(result->peopleRepositoryPort.save(peopleModel));
    }
}
