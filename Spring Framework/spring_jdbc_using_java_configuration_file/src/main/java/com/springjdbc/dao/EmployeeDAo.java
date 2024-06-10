package com.springjdbc.dao;

import com.springjdbc.entity.Employee;

public interface EmployeeDAo {
	int insert(Employee employee);
	int delete(int id);
	int update(Employee employee);
}
