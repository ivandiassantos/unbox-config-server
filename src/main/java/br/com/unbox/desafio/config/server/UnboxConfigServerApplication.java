package br.com.unbox.desafio.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UnboxConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnboxConfigServerApplication.class, args);
	}

}
