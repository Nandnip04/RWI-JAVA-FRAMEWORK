package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="User_demo")
public class User {

	@Id
	private int id;
	private String name;
	private String work;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public User(int id, String name, String work) {
		this.id = id;
		this.name = name;
		this.work = work;
	}
	public User() {
	}
	
}
