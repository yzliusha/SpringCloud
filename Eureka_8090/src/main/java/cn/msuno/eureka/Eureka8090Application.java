package cn.msuno.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka8090Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka8090Application.class, args);
	}

}
