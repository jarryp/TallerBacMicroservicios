package net.baccredomatic.tallermsv.gtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class TallermsvApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallermsvApiGatewayApplication.class, args);
	}

}
