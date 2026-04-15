package co.com.ancas.finance.config;

import co.com.ancas.finance.model.people.gateways.PeopleRepositoryPort;
import co.com.ancas.finance.model.users.gateways.UsersRepositoryPort;
import co.com.ancas.finance.usecase.adapters.people.PeopleUseCase;
import co.com.ancas.finance.usecase.adapters.user.UserUseCase;
import co.com.ancas.finance.usecase.ports.people.PeoplePort;
import co.com.ancas.finance.usecase.ports.user.UserPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

        @Bean
        public PeoplePort peoplePort(PeopleRepositoryPort peopleRepositoryPort){
         return new PeopleUseCase(peopleRepositoryPort);
        }

        @Bean
        public UserPort userPort(UsersRepositoryPort usersRepositoryPort){
                return new UserUseCase(usersRepositoryPort);
        }
}
