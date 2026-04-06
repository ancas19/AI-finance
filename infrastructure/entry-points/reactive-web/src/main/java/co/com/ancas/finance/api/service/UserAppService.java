package co.com.ancas.finance.api.service;

import co.com.ancas.finance.api.responses.UserRegistrationResponse;
import co.com.ancas.finance.model.people.PeopleModel;
import co.com.ancas.finance.model.users.UserCreationModel;
import co.com.ancas.finance.model.users.UserModel;
import co.com.ancas.finance.usecase.ports.people.PeoplePort;
import co.com.ancas.finance.usecase.ports.user.UserPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.reactive.TransactionalOperator;
import reactor.core.publisher.Mono;

@Service
public class UserAppService {
    private final UserPort userPort;
    private final PeoplePort peoplePort;
    private final TransactionalOperator transactionalOperator;

    public UserAppService(UserPort userPort, PeoplePort peoplePort, TransactionalOperator transactionalOperator) {
        this.userPort = userPort;
        this.peoplePort = peoplePort;
        this.transactionalOperator = transactionalOperator;
    }


    public Mono<UserRegistrationResponse> createUser(UserCreationModel userCreationModel){
        return this.peoplePort.createPeople(createPeopleModel(userCreationModel))
                .flatMap(peopleCreated->this.userPort.createUser(createUserModel(peopleCreated.getId(),userCreationModel)))
                .flatMap(userCreated->Mono.just(
                   new UserRegistrationResponse(
                           userCreationModel.getNames(),
                           userCreationModel.getLastNames(),
                           userCreationModel.getDni(),
                           userCreationModel.getCellphone(),
                           userCreationModel.getEmail()
                   )
                ))
                .as(transactionalOperator::transactional);
    }

    private UserModel createUserModel(Long id, UserCreationModel userCreationModel) {
        return new UserModel(null,userCreationModel.getEmail(),userCreationModel.getPassword(),id);
    }

    private PeopleModel createPeopleModel(UserCreationModel userCreationModel) {
        return  new PeopleModel(null,userCreationModel.getNames(),userCreationModel.getLastNames(),userCreationModel.getDni(),userCreationModel.getCellphone());
    }


}
