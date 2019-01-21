package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.fescar.rm.RMClientAT;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

@SpringBootApplication
@EnableDubbo
public class ServerUserApplication {

  public static void main(String[] args) {
    RMClientAT.init("service-user", "my_test_tx_group");
    SpringApplication.run(ServerUserApplication.class, args);
  }









}

