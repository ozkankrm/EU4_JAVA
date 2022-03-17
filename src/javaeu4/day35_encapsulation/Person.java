package javaeu4.day35_encapsulation;


public class Person {

	//instance variables
	private String name;
	private int age; // how � can restrict this access
	private char gender;
	 

	 public void setAge(int age){
		 
		 // condition
		 
		 if(age<0) {
			 System.out.println("not valid");
		 }
		 else {
			 this.age = age;	 
		 }		 
}
	 
	
/*
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
*/


	public int getAge() {
		 return this.age;
	 }
	 
}
