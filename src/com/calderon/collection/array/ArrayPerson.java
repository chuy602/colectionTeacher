package com.calderon.collection.array;

import com.calderon.collection.person.Person;
import com.calderon.collection.person.Student;
import com.calderon.collection.person.Teacher;

public class ArrayPerson {
	
	public void init() {
		Student[] studentArray = new Student[4];
		Student student1 = new Student("1A", "Pepe Perez", 25, "B3");
		Student student2 = new Student("2B", "Ana Sanz", 26, "C4");
		Student student3 = new Student("3C", "Luis Gomez", 27, "D5");
		studentArray[0] = student1;
		studentArray[1] = student2;
		studentArray[2] = student3;
		studentArray[3] = 
			new Student("4C", "Jesus Sanchez", 27, "E6");
//		this.showStudentArray(studentArray);
		this.showPersonArray(studentArray);
		//
		Teacher[] teacherArray = new Teacher[2];
		teacherArray[0] = 
			new Teacher("5D", "Rocio", 28, 100, "INGENIERO");
		teacherArray[1] = 
			new Teacher("6E", "Eva", 29, 200, "DOCTOR");
//		this.showTeacherArray(teacherArray);
		this.showPersonArray(teacherArray);
		//
		Person[] personArray = new Person[6];
		personArray[0] = student1;
		personArray[1] = student2;		
		personArray[2] = student3;
		personArray[3] = studentArray[3];
		
		personArray[4] = teacherArray[0];
		personArray[5] = teacherArray[1];
		
		this.showPersonArray(personArray);
				
	}

	private void showPersonArray(Person[] personArray) {
		System.out.println("\nContenido de personArray: ");
		for (int i = 0; i < personArray.length; i++) {
			System.out.println("i= " + i + ": " + personArray[i].toString());
		}	
	}

	private void showTeacherArray(Teacher[] teacherArray) {
		System.out.println("\nContenido de teacherArray: ");
		for (int i = 0; i < teacherArray.length; i++) {
			System.out.println("i= " + i + ": " + teacherArray[i]);
		}
	}

	private void showStudentArray(Student[] studentArray) {
		System.out.println("\nContenido de studentArray: ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("i= " + i + ": " + studentArray[i]);
		}
	}
	
}
