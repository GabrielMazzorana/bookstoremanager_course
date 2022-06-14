package com.gabrielmazzorana.bookstaremanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstaremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstaremanagerApplication.class, args);
	}

}
//Spring boot actuator: inclui diversos endpoints, ferramentas para ajudar a monitorar informações como
//número de commits de build, memória