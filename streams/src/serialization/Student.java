package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rollNo;
	String name;
	int age;
	String address;
	
	public Student(int rollNo, String name, int age, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void printDetails() {
		System.out.println("\nThis student's roll number is: " + this.rollNo);
		System.out.println("This student's name is: " + this.name);
		System.out.println("This student's age is: " + this.age);
		System.out.println("This student's address is: " + this.address);
	}
	
	
}
