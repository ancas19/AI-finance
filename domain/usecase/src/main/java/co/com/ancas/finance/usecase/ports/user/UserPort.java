package co.com.ancas.finance.usecase.ports.user;

import co.com.ancas.finance.model.users.UserModel;
import reactor.core.publisher.Mono;

public interface UserPort {
    Mono<UserModel> createUser(UserModel userModel);
}
