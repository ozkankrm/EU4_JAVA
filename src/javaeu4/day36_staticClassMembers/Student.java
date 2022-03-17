package javaeu4.day36_staticClassMembers;

public class Student {
	
	
	String name;
	int age;
	int idNumber; // belongs to object
	static String school = "Ceybertek"; // field alan�nda atama yapt���m�zda olu�an t�m objelere oldu�u gibi aktar�l�r.
										// t�m objelerde de�i�iklik yapmak istiyorsak variable ba��na static keyword yaz�yoruz
										// belongs to class // burda variabl�n ba��na static yazd���m�zda
										// main de s1.school yap�p yeni atama yapt���m�zda s1, s2 ve s3 teki hepsi de�i�ir.
	
	public Student(String name, int age, int idNumber) {
	
		this.name = name;
		this.age = age;
		idNumber = idNumber;
		this.school = school;
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", �dNumber=" + idNumber + ", school=" + school + "]";
	}
	
	

}
