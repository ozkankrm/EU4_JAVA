package javaeu4.day37_inheritance.Task;

public class EBook extends Book{
	
	double size;
	int pages;
	
	public void readbook() {
		
		System.out.println(title + "book pages is " + pages);
		System.out.println("This book written by " + author);
		System.out.println("This book type is " +type);
		
	}
	
}
