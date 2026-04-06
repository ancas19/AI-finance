package co.com.ancas.finance.usecase.ports.people;

import co.com.ancas.finance.model.people.PeopleModel;
import reactor.core.publisher.Mono;

public interface PeoplePort {
    Mono<PeopleModel> createPeople(PeopleModel peopleModel);
}
