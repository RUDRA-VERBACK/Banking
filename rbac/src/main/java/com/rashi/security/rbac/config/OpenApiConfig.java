package com.rashi.security.rbac.config;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "hariya",
                        email = "rashiip18@gmail.com",
                        url = "some url"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - Rashi",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://some-url.com"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",   //local env or prod env
                        url = "some url"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
