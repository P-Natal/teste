package com.testeSiebelController.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

		System.out.println("\n\n\n" +System.getenv("SERVICOS_DE_NOTIFICACAO_ATIVOS")+ "\n\n\n");

	}

}
