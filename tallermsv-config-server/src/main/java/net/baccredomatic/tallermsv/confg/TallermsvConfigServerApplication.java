package net.baccredomatic.tallermsv.confg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TallermsvConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallermsvConfigServerApplication.class, args);
	}

}
