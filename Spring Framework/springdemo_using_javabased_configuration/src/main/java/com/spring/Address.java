package com.spring;

public class Address {
    private int pincode;
    private String state;
    private String city;
	public Address(int pincode, String state, String city) {
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}
	public Address() {
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
}
