package co.com.ancas.finance.r2dbc.adapters;

import co.com.ancas.finance.model.users.UserModel;
import co.com.ancas.finance.model.users.gateways.UsersRepositoryPort;
import co.com.ancas.finance.r2dbc.mapper.UserDatabaseMapper;
import co.com.ancas.finance.r2dbc.repositories.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserRepositoryAdapter implements UsersRepositoryPort {
    private final UserRepository userRepository;
    private final UserDatabaseMapper userDatabaseMapper;

    public UserRepositoryAdapter(UserRepository userRepository, UserDatabaseMapper userDatabaseMapper) {
        this.userRepository = userRepository;
        this.userDatabaseMapper = userDatabaseMapper;
    }

    @Override
    public Mono<Boolean> verifyEmailAlreadyExists(String email) {
        return this.userRepository.existsByEmail(email);
    }

    @Override
    public Mono<UserModel> createUser(UserModel userModel) {
        return this.userRepository.save(userDatabaseMapper.toUsersEntity(userModel))
                .map(this.userDatabaseMapper::toUserModel);
    }
}
