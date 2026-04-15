package co.com.ancas.finance.api.rest.route;

import co.com.ancas.finance.api.rest.handler.HealthCheckHandler;
import io.swagger.v3.oas.annotations.Operation;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HealthCheckRouterRest {

    @RouterOperation(
            path = "health-check",
            method = RequestMethod.GET,
            beanClass = HealthCheckHandler.class,
            beanMethod = "healthCheck",
            operation = @Operation(
                    operationId = "healthCheck",
                    summary = "Health check endpoint"
            )
    )

    @Bean
    public RouterFunction<ServerResponse> routerFunction(HealthCheckHandler healthCheckHandler) {
        return route(GET("/health-check"), healthCheckHandler::healthCheck);
    }
}
