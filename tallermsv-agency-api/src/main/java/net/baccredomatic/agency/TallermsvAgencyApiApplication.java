package net.baccredomatic.agency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TallermsvAgencyApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(TallermsvAgencyApiApplication.class, args);
	}
}
