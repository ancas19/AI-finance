package co.com.ancas.finance.r2dbc.adapters;

import co.com.ancas.finance.model.people.PeopleModel;
import co.com.ancas.finance.model.people.gateways.PeopleRepositoryPort;
import co.com.ancas.finance.r2dbc.repositories.PeopleRepsitory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PeopleRepositoryAdapter implements PeopleRepositoryPort {
    private final PeopleRepsitory peopleRepsitory;

    public PeopleRepositoryAdapter(PeopleRepsitory peopleRepsitory) {
        this.peopleRepsitory = peopleRepsitory;
    }

    @Override
    public Mono<Boolean> verifyDniExists(String dni) {
        return peopleRepsitory.existsByDni(dni);
    }

    @Override
    public Mono<PeopleModel> save(PeopleModel peopleModel) {
        return ;
    }
}
