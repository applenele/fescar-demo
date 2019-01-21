package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DruidConfig {

  @ConfigurationProperties(prefix = "spring.datasource")
  @Bean
  public DruidDataSource druidDataSource() {
    return new DruidDataSource();
  }


  @Bean
  public DataSourceProxy getDataSourceProxy() {
    return new DataSourceProxy(druidDataSource());
  }

  @Bean
  public JdbcTemplate getJdbcTemplate() {
    return new JdbcTemplate(getDataSourceProxy());
  }

  @Bean
  public GlobalTransactionScanner getGlobalTransactionScanner() {
    return new GlobalTransactionScanner("service-order", "my_test_tx_group");
  }


}
