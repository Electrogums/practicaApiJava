package com.apineoris.apineoris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication()
@ComponentScan({"com.apineoris.*"})
@EnableJpaRepositories("com.apineoris.repository")
@EntityScan("com.apineoris.model")
public class ApineorisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApineorisApplication.class, args);
	}

}
