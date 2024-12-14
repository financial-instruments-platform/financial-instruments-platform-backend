package org.devexperts.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Value("${api.mockdata.url}")
    private String MOCK_DATA_URL;

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl(MOCK_DATA_URL);
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("Konstantine Vashalomidze");
        myContact.setEmail("vashalomidzekonstantine@gmail.com");

        Info information = new Info()
                .title("Main spring boot application")
                .version("1.0")
                .description("This API exposes endpoints to Authentication / Authorization, retrieving history between two users.")
                .contact(myContact);
        return new OpenAPI().addSecurityItem(new SecurityRequirement().
                        addList("Bearer Authentication"))
                .components(new Components().addSecuritySchemes
                        (
                                "Bearer Authentication",
                                createAPIKeyScheme()
                        ))
                .info(information)
                .servers(List.of(server));
    }


    private SecurityScheme createAPIKeyScheme() {
        return new SecurityScheme().type(SecurityScheme.Type.HTTP)
                .bearerFormat("JWT")
                .scheme("bearer");
    }


}