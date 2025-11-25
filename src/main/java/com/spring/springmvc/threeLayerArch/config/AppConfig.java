package com.spring.springmvc.threeLayerArch.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.springmvc.threeLayerArch.repository.UserDAO;
import com.spring.springmvc.threeLayerArch.repository.UserDAOImpl;
import com.spring.springmvc.threeLayerArch.service.UserService;
import com.spring.springmvc.threeLayerArch.service.UserServiceImpl;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mydb");
		ds.setUsername("root"); // change as needed
		ds.setPassword("your_mysql_password"); // change as needed

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager txManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public UserDAO userRepository(JdbcTemplate jdbcTemplate) {
		return new UserDAOImpl(jdbcTemplate);
	}

	@Bean
	public UserService userService(UserDAO userRepository) {
		return new UserServiceImpl(userRepository);
	}
}
