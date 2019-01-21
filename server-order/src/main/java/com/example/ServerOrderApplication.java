package com.example;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@SpringBootApplication
@EnableDubbo
public class ServerOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerOrderApplication.class, args);
	}







}

