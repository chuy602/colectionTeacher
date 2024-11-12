package com.calderon.collection.stream;

public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	
	public Employee(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getAge()=" + getAge() + ", getSalary()=" + getSalary() + "]";
	}
	
}
