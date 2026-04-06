package co.com.ancas.finance.model.users.gateways;

import co.com.ancas.finance.model.users.UserModel;
import reactor.core.publisher.Mono;

public interface UsersRepositoryPort {
    Mono<Boolean> verifyEmailAlreadyExists(String email);

    Mono<UserModel> createUser(UserModel userModel);
}
