package com.paycraftsol.prepaidgpr.gprmasterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableJpaRepositories("com.paycraftsol.prepaidgpr")
@EntityScan("com.paycraftsol.prepaidgpr")
@ComponentScan({"com.paycraftsol.prepaidgpr"})
//@EnableDiscoveryClient
@SpringBootApplication
public class GprMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GprMasterServiceApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.paycraftsol.prepaidgpr"))
				.paths(PathSelectors.any())
				.build();
	}


	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource
				= new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:errorCodes");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
