package com.calderon.collection.person;

public class Teacher extends Person {
	private Integer nrp;
	private String degree;
	
	public Teacher(
			String dni, 
			String nombre, 
			Integer edad, 
			Integer nrp, 
			String degree) {
		super(dni, nombre, edad);
		this.nrp = nrp;
		this.degree = degree;
	}

	public Integer getNrp() {
		return nrp;
	}

	public String getDegree() {
		return degree;
	}

	public void setNrp(Integer nrp) {
		this.nrp = nrp;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Teacher [getNrp()=" + getNrp() + ", getDegree()=" + getDegree() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
