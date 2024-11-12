package com.calderon.collection.person;

public abstract class Person {
	private String dni;
	private String nombre;
	private Integer edad;
	
	public Person() {
		super();
	}

	public Person(String dni, String nombre, Integer edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [getDni()=" + getDni() 
			+ ", getNombre()=" + getNombre() 
			+ ", getEdad()=" + getEdad() + "]";
	}

}
