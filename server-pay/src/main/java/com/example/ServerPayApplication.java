package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableDubbo
public class ServerPayApplication {



	public static void main(String[] args) {
		SpringApplication.run(ServerPayApplication.class, args);
	}

}

