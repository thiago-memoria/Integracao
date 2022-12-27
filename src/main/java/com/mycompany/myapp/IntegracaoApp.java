package com.mycompany.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntegracaoApp extends SpringBootServletInitializer {

	/**
	 * Main method, used to run the application.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {	
		SpringApplication.run(IntegracaoApp.class, args);
	}
}