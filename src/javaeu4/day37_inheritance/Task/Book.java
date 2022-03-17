package javaeu4.day37_inheritance.Task;

public class Book {
	
	String title;
	String type;
	String author;
	private double price;

	
	public void read(int page) {
		System.out.println("I read " + page + " page");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
