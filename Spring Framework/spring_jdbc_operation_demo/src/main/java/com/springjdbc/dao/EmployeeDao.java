package com.springjdbc.dao;

import com.springjdbc.entity.Employee;

public interface EmployeeDao {
	int insert(Employee emp);
	int update(Employee emp);
	int delete(int id);
}
