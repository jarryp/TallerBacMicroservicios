package net.baccredomatic.common.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CommonApiRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(CommonApiRegistryApplication.class, args);
	}
}
