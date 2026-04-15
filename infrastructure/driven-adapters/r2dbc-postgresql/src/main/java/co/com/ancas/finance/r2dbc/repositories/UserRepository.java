package co.com.ancas.finance.r2dbc.repositories;

import co.com.ancas.finance.r2dbc.entities.UsersEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<UsersEntity, Long>, ReactiveQueryByExampleExecutor<UsersEntity> {
    Mono<Boolean> existsByEmail(String email);
}
