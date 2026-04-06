package co.com.ancas.finance.r2dbc.repositories;


import co.com.ancas.finance.r2dbc.entities.PeopleEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Mono;

public interface PeopleRepsitory extends R2dbcRepository<PeopleEntity, Long>, ReactiveQueryByExampleExecutor<PeopleEntity> {
    Mono<Boolean> existsByDni(String dni);
}
