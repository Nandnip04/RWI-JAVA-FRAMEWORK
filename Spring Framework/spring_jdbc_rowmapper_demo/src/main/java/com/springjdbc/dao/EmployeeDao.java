package com.springjdbc.dao;
import java.util.*;
import com.springjdbc.entity.Employee;

public interface EmployeeDao {
	int insert(Employee employee);
	Employee getEmployee(int id);
	List<Employee> getAllEmployees();
}
