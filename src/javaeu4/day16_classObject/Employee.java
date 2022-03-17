package javaeu4.day16_classObject;

public class Employee {

	/*
	�Write a Employee class
	
	Employee
	
	name
	jobTitle
	salary
	
	work()
	attendMeeting()
	introduce()
	*/

//	properties
	String name;
	String jobTitle;
	double salary;
	
//	method
	public void work() {
		
		System.out.println(name + " is hard working");
	}
	public void attendMeeting() {
		
		System.out.println(name + " is attending a meeting");
	}
	public void introduce() {
		
		System.out.println("Name: " +name+ " Job title: " + jobTitle+ " salary: " + salary);
	}
	
}
