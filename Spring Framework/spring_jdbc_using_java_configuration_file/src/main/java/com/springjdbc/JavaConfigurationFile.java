package com.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.daoimpl.EmployeeDaoImpl;

@Configuration
public class JavaConfigurationFile {

	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/SpringJdbc");
		ds.setUsername("root");
		ds.setPassword("Nandni@2003");
		
		return ds;	
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemp=new JdbcTemplate();
		jdbcTemp.setDataSource(dataSource());
		
		return jdbcTemp;
	}
	
	@Bean
	public EmployeeDaoImpl employeeDao() {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.setJdbcTemplate(jdbcTemplate());
		
		return dao;
		
	}
}
