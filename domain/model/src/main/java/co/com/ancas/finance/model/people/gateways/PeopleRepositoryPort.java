package co.com.ancas.finance.model.people.gateways;

import co.com.ancas.finance.model.people.PeopleModel;
import reactor.core.publisher.Mono;

public interface PeopleRepositoryPort {
    Mono<Boolean> verifyDniExists(String dni);

    Mono<PeopleModel> save(PeopleModel peopleModel);
}
