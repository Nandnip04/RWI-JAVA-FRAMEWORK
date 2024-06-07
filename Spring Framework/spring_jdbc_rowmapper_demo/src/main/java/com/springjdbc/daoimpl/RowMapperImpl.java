package com.springjdbc.daoimpl;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.entity.Employee;

public class RowMapperImpl  implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));
		emp.setAddress(rs.getString(4));
		return emp;
	}

}
