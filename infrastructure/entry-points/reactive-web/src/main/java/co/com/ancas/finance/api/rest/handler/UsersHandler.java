package co.com.ancas.finance.api.rest.handler;

import co.com.ancas.finance.api.mapper.UserMapper;
import co.com.ancas.finance.api.requests.UserRegistrationRequest;
import co.com.ancas.finance.api.service.UserAppService;
import co.com.ancas.finance.api.util.CustomValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UsersHandler {
    private final CustomValidator customValidator;
    private final UserAppService userAppService;
    private final UserMapper userMapper;

    public UsersHandler(CustomValidator customValidator, UserAppService userAppService, UserMapper userMapper) {
        this.customValidator = customValidator;
        this.userAppService = userAppService;
        this.userMapper = userMapper;
    }

    public Mono<ServerResponse> registerUsers(ServerRequest serverRequest){
        return serverRequest.bodyToMono(UserRegistrationRequest.class)
                .flatMap(customValidator::validate)
                .map(userMapper::mapToUserCreationModel)
                .flatMap(this.userAppService::createUser)
                .flatMap(userCreated->ServerResponse
                        .status(HttpStatus.CREATED)
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(userCreated)
                );
    }
}
