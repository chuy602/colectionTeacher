package com.calderon.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.calderon.collection.person.Person;
import com.calderon.collection.person.Student;
import com.calderon.collection.person.Teacher;

public class HashSetPerson {

	public void init() {	
		Set<Person> personSet = new HashSet<Person>();

		personSet.add(new Student("1A", "Pepe Perez", 25, "B3"));
		personSet.add(new Student("2B", "Ana Sanz", 26, "C4"));
		personSet.add(new Student("3C", "Luis Gomez", 27, "D5"));
		personSet.add(new Student("4C", "Jesus Sanchez", 27, "E6"));
		personSet.add(new Teacher("5D", "Rocio", 28, 100, "INGENIERO"));
		personSet.add(new Teacher("6E", "Eva", 29, 200, "DOCTOR"));
		personSet.add(new Student("1A", "Pepe Perez", 25, "B3"));
		
		Student studentDuplicado = new Student("10Z", "Diego", 24, "DDDDD50");
		personSet.add(studentDuplicado);
		personSet.add(studentDuplicado); // Los Set no permiten duplicados.
		
		this.showPersonHashSet(personSet);				
	}

	private void showPersonHashSet(Set<Person> personSet) {
		System.out.println("\nContenido de personSet: ");
		for (Person person : personSet) {  // for each
			System.out.println(person);
		}	
	}
	
}
