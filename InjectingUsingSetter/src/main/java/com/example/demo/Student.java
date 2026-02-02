package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	Laptop ref;
	void study() {
		System.out.println("Student is studying");
		
	}
	void lap() {
		ref.useLaptop();
	}
	public Laptop getRef() {
		return ref;
	}
	@Autowired
	public void setRef(Laptop ref) {
		this.ref = ref;
	}
	
	
}
