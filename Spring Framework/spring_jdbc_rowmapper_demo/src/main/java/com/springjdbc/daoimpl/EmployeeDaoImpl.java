package com.springjdbc.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	
	//insert data
	@Override
	public int insert(Employee employee) {
		String query="insert into Employee values(?,?,?,?)";
		int result=this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getSalary(),employee.getAddress());
		return result;
	}
	
	//fatch one employee data
	@Override
	public Employee getEmployee(int id) {
		String query ="select * from Employee where id=?";
		RowMapperImpl rowMapper=new RowMapperImpl();
		Employee emp=this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return emp;
	}
	
	//fatch all employe data
	@Override
	public List<Employee> getAllEmployees() {
		String query="select * from Employee";
		List<Employee> emp=this.jdbcTemplate.query(query,new RowMapperImpl());
		return emp;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
