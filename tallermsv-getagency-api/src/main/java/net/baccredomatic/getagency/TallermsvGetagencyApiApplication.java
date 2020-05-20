package net.baccredomatic.getagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TallermsvGetagencyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallermsvGetagencyApiApplication.class, args);
	}

}
