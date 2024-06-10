package com.spring;
import java.util.*;
public class Subject {
	private List<String> subject;

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + "]";
	}
	
	
	
}
