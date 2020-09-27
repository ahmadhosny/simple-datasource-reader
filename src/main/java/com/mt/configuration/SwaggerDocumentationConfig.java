package com.mt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-18T07:56:50.341Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {
  
  ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Simple datasource reader")
        .description("This is a simple datasource reader API")
        .license("Apache 2.0")
        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
        .termsOfServiceUrl("")
        .version("1.0.0")
        .contact(new Contact("Ahmad Hosny Elsayed", "", "ahmad.hosny.attia@gmail.com"))
        .build();
  }
  
  @Bean
  public Docket customImplementation() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
        .build()
        .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
        .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
        .apiInfo(apiInfo());
  }
  
}
