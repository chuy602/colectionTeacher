package com.calderon.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.calderon.collection.person.Person;
import com.calderon.collection.person.Student;
import com.calderon.collection.person.Teacher;

public class ArrayListPerson {

	public void init() {	
		List<Person> personList = new ArrayList<Person>();

		personList.add(new Student("1A", "Pepe Perez", 25, "B3"));
		personList.add(new Student("2B", "Ana Sanz", 26, "C4"));
		personList.add(new Student("3C", "Luis Gomez", 27, "D5"));
		personList.add(new Student("4C", "Jesus Sanchez", 27, "E6"));
		personList.add(new Teacher("5D", "Rocio", 28, 100, "INGENIERO"));
		personList.add(new Teacher("6E", "Eva", 29, 200, "DOCTOR"));
		
		Student studentDuplicado = new Student("10Z", "Diego", 24, "DDDDD50");
		personList.add(studentDuplicado);
		personList.add(studentDuplicado); // Los List permiten duplicados.
		
		
		this.showPersonArrayList(personList);				
	}

	private void showPersonArrayList(List<Person> personList) {
		System.out.println("\nContenido de personList: ");
		for (Person person : personList) {  // for each
			System.out.println(person);
		}	
//		for (int i = 0; i < personList.size(); i++) {
//			System.out.println("i= " + i + ": " + personList.get(i).toString());
//		}	
	}
	
}
