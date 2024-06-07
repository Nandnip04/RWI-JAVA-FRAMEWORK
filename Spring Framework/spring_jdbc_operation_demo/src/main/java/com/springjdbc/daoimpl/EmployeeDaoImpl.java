package com.springjdbc.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao

{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//insert operation
	public int insert(Employee emp) {
		String query="insert into Employee values(?,?,?,?)";
		int result=this.jdbcTemplate.update(query,emp.getId(),emp.getName(),emp.getSalary(),emp.getAddress());
		return result;
	}

	//update operation
	public int update(Employee emp) {
		String query="update Employee set name=?,salary=?,address=? where id=?";
		int result=this.jdbcTemplate.update(query,emp.getName(),emp.getSalary(),emp.getAddress(),emp.getId());
		return result;
	}

	public int delete(int id) {
		String query="delete from Employee where id=?";
		int result=this.jdbcTemplate.update(query,id);
		return result;
	}

}
