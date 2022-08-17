package com.dbs.demos.Springjdbc;



import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
@PropertySource("db.properties")
public class DBConfig {
	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${dbusername}")
	private String username;
	@Value("${password}")
	private String password;
	@Bean
	public DataSource connect() {
		System.out.println(driver);
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		
		return datasource;
	}
	@Bean
	@Autowired
	public JdbcTemplate template(DataSource ds) {
		return new JdbcTemplate(ds);
		
	}
	@Bean
	public List<String> fruits() {
		return Arrays.asList("apple","kiwi");
		
	}

}
