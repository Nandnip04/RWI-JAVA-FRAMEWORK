package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Employee_Records")
public class Employee {
	
	@Id
	@Column(name="e_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name="mobile_number")
	private String number;
	
	@Transient
	private String city;
	
	@Lob
	private byte image[];

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Employee(int id, String name, String number, String city, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.city = city;
		this.image = image;
	}

	public Employee() {
		super();
	}

	
	
	
}
