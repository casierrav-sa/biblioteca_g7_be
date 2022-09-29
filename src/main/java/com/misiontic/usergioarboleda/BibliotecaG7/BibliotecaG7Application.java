package com.misiontic.usergioarboleda.BibliotecaG7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BibliotecaG7Application {
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaG7Application.class, args);
	}
}