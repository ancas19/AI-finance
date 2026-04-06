package co.com.ancas.finance.usecase.adapters.user;

import co.com.ancas.finance.model.exceptions.BadRequestException;
import co.com.ancas.finance.model.users.UserModel;
import co.com.ancas.finance.model.users.gateways.UsersRepositoryPort;
import co.com.ancas.finance.usecase.ports.user.UserPort;
import reactor.core.publisher.Mono;

import static co.com.ancas.finance.model.enums.ErrorMessages.ERROR_MESSAGE_EMAIL_ALREADY_EXISTS;

public class UserUseCase  implements UserPort {
    private final UsersRepositoryPort usersRepositoryPort;

    public UserUseCase(UsersRepositoryPort usersRepositoryPort) {
        this.usersRepositoryPort = usersRepositoryPort;
    }

    @Override
    public Mono<UserModel> createUser(UserModel userModel) {
        return this.usersRepositoryPort.verifyEmailAlreadyExists(userModel.getEmail())
                .filter(exists->!exists)
                .switchIfEmpty(Mono.error(new BadRequestException(ERROR_MESSAGE_EMAIL_ALREADY_EXISTS.getMessage().formatted(userModel.getEmail()))))
                .flatMap(ignored->this.usersRepositoryPort.createUser(userModel));
    }
}
