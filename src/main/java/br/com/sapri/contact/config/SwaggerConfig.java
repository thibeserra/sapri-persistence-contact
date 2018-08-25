package br.com.sapri.contact.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.sapri.contact.controller"))
				.paths(PathSelectors.any())
				.build().apiInfo(this.apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo("SAPRI-PERSISTENCE-CONTACT",
				"Acessa e manipula informações da base de clientes e usuários", "1.0", "",
				new Contact("Thiago Beserra", "", "thiago.depaula.beserra@gmail.com"), "Free Licence", "",
				Collections.emptyList());
	}
}
