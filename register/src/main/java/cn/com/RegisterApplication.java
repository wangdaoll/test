package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication
@EnableEurekaServer//创建注册中心
public class RegisterApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
