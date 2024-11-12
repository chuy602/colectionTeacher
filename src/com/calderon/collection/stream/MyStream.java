package com.calderon.collection.stream;

import java.util.List;
import java.util.ArrayList;

public class MyStream {
	
	public void init() {
		
		List<Employee> employeeList = this.getNewListWithLoadedEmployee();
		
		this.showEmployeeList(employeeList);
		
		this.showEmployeeListWithSalaryLessThan6000(employeeList);
		
		
	}
	
	private void showEmployeeListWithSalaryLessThan6000(List<Employee> employeeList) {
		System.out.println("\nLista de empleados con salario < 6000:");
//		for (int i=0; i < employeeList.size(); i++) {
//			if (employeeList.get(i).getSalary() < 6000D) {
//				System.out.println(employeeList.get(i));
//			}
//		}			
		employeeList
			.stream()
			.filter(x -> x.getSalary() < 6000D)
			.forEach(x -> System.out.println(x));
	}

	private void showEmployeeList(List<Employee> employeeList) {
		System.out.println("La lista de empleados contiene:");
//		for (int i=0; i < employeeList.size(); i++) {
//			System.out.println(employeeList.get(i));
//		}			
		employeeList
			.stream()
			.forEach(employee -> System.out.println(employee));
	}

	private List<Employee> getNewListWithLoadedEmployee() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Rocio", 25, 2000.00));
		employeeList.add(new Employee("Eva", 26, 3000.00));
		employeeList.add(new Employee("Diana", 27, 4000.00));
		employeeList.add(new Employee("Eduardo", 28, 5000.00));
		employeeList.add(new Employee("Diego", 29, 6000.00));
		employeeList.add(new Employee("Fernando", 30, 7000.00));
		employeeList.add(new Employee("Wertitan", 31, 8000.00));
		employeeList.add(new Employee("Ander", 32, 9000.00));
		return employeeList;
	}

}
