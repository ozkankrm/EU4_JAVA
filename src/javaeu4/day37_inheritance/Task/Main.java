package javaeu4.day37_inheritance.Task;

public class Main {

	public static void main(String[] args) {


		Book bok = new Book();
		EBook ebok = new EBook();
		AudioBook aubok = new AudioBook();
		
		ebok.setPrice(50);
		System.out.println("EBook price is: "+ ebok.getPrice());

		ebok.size = 10;
		System.out.println("size is: " + ebok.size);
		
		ebok.pages = 320;
		ebok.title = "Java Language";
		ebok.type = "Software";
		ebok.author = "Mike";
		
		ebok.readbook();
		
		System.out.println("========================================");
		aubok.narrator = "Tom";
	
		
		aubok.setPrice(100);
		System.out.println("Price audiobook is: " + aubok.getPrice());
		
		aubok.title = "Fun Machine";
		aubok.author = "Jimmy";
		aubok.length = 7;
		aubok.type = "Hardware";
		aubok.listen();
		
		System.out.println("Title: " + aubok.title + ", Author: " + aubok.author+ ", Type: " + aubok.type);
		
	
		
		
	}

}
