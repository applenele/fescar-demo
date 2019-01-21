package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import java.sql.SQLException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DruidConfig {


  @Bean
  public ServletRegistrationBean druidServlet() {
    ServletRegistrationBean reg = new ServletRegistrationBean();
    reg.setServlet(new StatViewServlet());
    reg.addUrlMappings("/druid/*");
    reg.addInitParameter("loginUsername", "admin");
    reg.addInitParameter("loginPassword", "admin");
    reg.addInitParameter("logSlowSql", "123456");
    return reg;
  }

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
    return new GlobalTransactionScanner("server-user", "my_test_tx_group");
  }

}
