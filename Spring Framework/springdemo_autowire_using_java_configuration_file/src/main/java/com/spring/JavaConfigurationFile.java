package com.spring;
import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigurationFile {

	@Bean
	public Address getAddress() {
		
		Address address=new Address();
		address.setPincode(450661);
		address.setCity("Arud");
		address.setCity("Madhya Pradesh");
		return address;
		
	}
	
	@Bean
	public Subject getSubject1() {
		Subject sub =new Subject();
		
		List<String> subject_list=new ArrayList();
		subject_list.add("Java");
		subject_list.add("Python");
		subject_list.add("C++");
		
		sub.setSubject(subject_list);
		
		return sub;
	}
	
	@Bean
	public Subject getSubject2() {
		Subject sub =new Subject();
		
		List<String> subject_list=new ArrayList();
		subject_list.add("Computer");
		subject_list.add("Maths");
		sub.setSubject(subject_list);
		
		return sub;
	}
	
	@Bean
	public Employee getEmployeeData() {
		Employee emp=new Employee();
		emp.setId(5);
		emp.setName("Nandni");
		return emp;
	}
}
