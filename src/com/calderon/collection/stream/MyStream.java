package com.calderon.collection.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public class MyStream {
	
	public void init() {
		
		List<Employee> employeeList = this.getNewListWithLoadedEmployee();
		
		this.showEmployeeList(employeeList);
		
		//this.showEmployeeListWithSalaryLessThan6000(employeeList);
		
		//this.showEmployeeListAndCreateNewStringList(employeeList);
		
		//this.useOfClassStream(employeeList);
		
		//this.useOfPeek(employeeList);
		
		//this.useOfGeneralReduction(employeeList);
		
		//this.useOfSimplifiedReduction(employeeList);
		
		this.useOfCollector(employeeList);
		
	}
	
	private void useOfCollector(List<Employee> employeeList) {
		List<Employee> bossList = employeeList
				.stream()
				.filter( x -> x.getSalary() > 5000)
				.collect(Collectors.toList());
		System.out.println("\nLista de jefes: ");
		bossList.stream().forEach(System.out::println);
		// otra opcion
		System.out.println("\nLista de jefes: " +
		 employeeList
				.stream()
				.filter( x -> x.getSalary() > 5000)
				.map(x -> x.getName() + ">" + x.getSalary())
				.collect(Collectors.joining("\n \t|", "\nStart List\n\t| ", "\nEnd List ")));
		
		
	}

	private void useOfSimplifiedReduction(List<Employee> employeeList) {
		System.out.println("\nla suma de todas las edades es: " + 
				employeeList
				.stream()
		.mapToInt(x -> x.getAge())
		.sum());
		//
		DoubleSummaryStatistics estadisticas = employeeList
				.stream()
				.mapToDouble(Employee:: getAge)
				.summaryStatistics();
		System.out.println("\nEstadisticas de la edad de los empleados: "
				 + "count= " + estadisticas.getCount()
				+ " avg= " + estadisticas.getAverage()
				+ " max= " + estadisticas.getMax()
				+ " min= " + estadisticas.getMin()
				+ " sum= " + estadisticas.getSum());
		
	}

	private void useOfGeneralReduction(List<Employee> employeeList) {
		System.out.println("\nla suma de todas las edades es: " + 
		employeeList
		.stream()
		.map(x -> x.getAge())
		.reduce(0,(age1, age2) -> age1 + age2));
		
		System.out.println("\nla suma de todas las edades es: " + 
				employeeList
				.stream()
		.map(x -> x.getAge())
		.reduce(0,(age1, age2) -> age1 * age2));
		//
		List<Employee> employeeList2 = new ArrayList<>();
		employeeList2.add(new Employee("Luis", 50, 1200.00));
		System.out.println("\n La suma de edades con 1 solo elemento: " +
		employeeList2
		.stream()
		.map(x -> x.getAge())
		.reduce(7,(age1, age2) -> age1 + age2));
		
		
		
	}

	private void useOfPeek(List<Employee> employeeList) {
		System.out.println("\nEmpelados con salario > 5000: ");
		
		employeeList
		.stream()
		.peek( x -> System.out.println("peek inicial: " + x.getSalary()))
		.filter(p -> p.getSalary() > 5000)
		.peek( x -> System.out.println("peek final: " + x.getSalary()))
		.forEach(System.out::println); 			
		
		
		
	}

	private void useOfClassStream(List<Employee> employeeList) {
		employeeList.stream().forEach(System.out::println);
		employeeList.stream().forEach(System.out::println);
		
//		Stream<Employee> employeeStream1 = employeeList.stream();
//		employeeStream1.forEach(System.out::println);
//		
//		
//		Stream<Employee> employeeStream2 = employeeList.stream();
//		employeeStream2.forEach(System.out::println);
	}

	private void showEmployeeListAndCreateNewStringList(List<Employee> employeeList) {
		List<String> resultList = new ArrayList<String>();
		Consumer <String> c1 = z-> resultList.add(z);         //resultList::add;
		Consumer <String> c2 = p -> System.out.println(p);   //System.out::println;
		Predicate<Employee> p1 = q -> q.getAge() < 30;
		Predicate<Employee> p2 = q -> q.getSalary() > 3000;
		
		employeeList
		.stream()
		//.filter (x-> x.getAge()<30 && x.getSalary() > 3000.00)
		.filter(p1.and(p2))
		.map(x -> x. getName()+ ">" + x.getAge())
		.forEach(c1.andThen(c2));
		
		System.out.println("\nresultList: " +resultList);
		
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
