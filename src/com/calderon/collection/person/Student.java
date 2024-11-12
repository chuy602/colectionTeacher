package com.calderon.collection.person;

public class Student extends Person {
	private String id;

	public Student(
			String dni, 
			String nombre, 
			Integer edad, 
			String id) {
		super(dni, nombre, edad);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() 
			+ ", toString()=" + super.toString() + "]";
	}
	
	
	



}
