package assignments.Assignmet_9;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double price = 0;
		System.out.println("Select screen size:");
		double screenSize= scan.nextDouble();
		
		System.out.println("Select CPU type:");
		String CPU = scan.next();
		
		System.out.println("Select RAM size:");
		int RAM = scan.nextInt();
		
		System.out.println("Select storage type");
		String storage = scan.next();
		
		System.out.println("Enter memory size");
		int memory = scan.nextInt();
		
		System.out.println("Enter screen resolution");
		String resolution = scan.next();
		
		
		if(screenSize==13.3) {
			price += 200;	
		}else if(screenSize==15.0) {
			price += 300;
		}else if(screenSize==17.3) {
			price += 400;
		}
		if(CPU.equals("i3")) {
			price += 150;
		}else if(CPU.equals("i5")) {
			price += 250;
		}else if(CPU.equals("i7")) {
			price += 350;
		}
		if(RAM==4){
			price += 50;
		}else if(RAM==8) {
			price += 100;
		}
		
		if(storage.equalsIgnoreCase("HDD")) {
			if(memory==500) {
				price += 50;
			}else if(memory==1000 ) {
				price += 100;
			}
		}else if(storage.equalsIgnoreCase("SSD")) {
			if(memory==500) {
				price += 100;
			}else if(memory==1000 ) {
				price += 200;
			}
		}
		
		if(resolution.equalsIgnoreCase("FULLHD")) {
			price += 100;
		}else if(resolution.equalsIgnoreCase("4K")) {
			price += 200;
		}
		System.out.println(price);
	}

}
