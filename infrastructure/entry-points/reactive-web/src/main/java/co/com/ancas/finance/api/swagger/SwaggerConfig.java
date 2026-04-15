package co.com.ancas.finance.api.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("AI Finance API")
                                .version("1.0.0")
                                .description("REST API for AI Finance application")
                                .contact(
                                        new Contact()
                                                .name("AI Finance Team")
                                )
                );
    }
}
