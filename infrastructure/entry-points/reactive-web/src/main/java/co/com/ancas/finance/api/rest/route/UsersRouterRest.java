package co.com.ancas.finance.api.rest.route;

import co.com.ancas.finance.api.requests.UserRegistrationRequest;
import co.com.ancas.finance.api.rest.handler.UsersHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springdoc.core.annotations.RouterOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UsersRouterRest {

    private final UsersHandler usersHandler;

    public UsersRouterRest(UsersHandler usersHandler) {
        this.usersHandler = usersHandler;
    }

    @RouterOperations({
            @RouterOperation(
                    path = "/auth",
                    method = RequestMethod.POST,
                    beanClass = UsersHandler.class,
                    beanMethod = "registerUsers",
                    operation = @Operation(
                            operationId = "registerUser",
                            summary = "Register a new user",
                            requestBody = @RequestBody(
                                    required = true,
                                    content = @Content(schema = @Schema(implementation = UserRegistrationRequest.class))
                            ),
                            responses = {
                                    @ApiResponse(responseCode = "201", description = "User created successfully"),
                                    @ApiResponse(responseCode = "400", description = "Invalid request")
                            }
                    )
            )
    })

    @Bean
    public RouterFunction<ServerResponse> routerUserFunction() {
        return route(GET("/auth"), usersHandler::registerUsers);
    }
}
