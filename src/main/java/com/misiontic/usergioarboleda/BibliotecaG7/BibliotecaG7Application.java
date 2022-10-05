package com.misiontic.usergioarboleda.BibliotecaG7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.misiontic.usergioarboleda.BibliotecaG7.models"})
@SpringBootApplication
public class BibliotecaG7Application {
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaG7Application.class, args);
	}
}