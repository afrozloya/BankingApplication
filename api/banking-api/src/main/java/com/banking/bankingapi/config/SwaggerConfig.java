package com.banking.bankingapi.config;

import com.banking.bankingapi.constant.BankingApiConstant;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(BankingApiConstant.PROJECT_TITLE)
                        .description(BankingApiConstant.PROJECT_DESCRIPTION)
                        .version(BankingApiConstant.PROJECT_VERSION)
                        .license(new License().name(BankingApiConstant.LICENSE).url(BankingApiConstant.LICENSE_URL)))
                .externalDocs(new ExternalDocumentation()
                        .description(BankingApiConstant.PROJECT_WIKI)
                        .url(BankingApiConstant.GITHUB_URL));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group(BankingApiConstant.GROUP_PUBLIC)
                .pathsToMatch(BankingApiConstant.PUBLIC_URL)
                .build();
    }
}