package javaeu4.day31_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

	public static void main(String[] args) {
		// Creating ArrayList

		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Double> d1 = new ArrayList<>();
		ArrayList<Float> f1 = new ArrayList<>();
		
		//Assigning values to ArrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		num.add(99);
		num.add(10);
		num.add(100);
		num.add(new Integer("100")); // there are this way but dont use usually 
		
		//Reading from ArrayList
		
		names.get(0);
		System.out.println(names.get(0));//Mike
		System.out.println(names.get(1));//Smith
		System.out.println(names.get(2));//John
		
		//size
		names.size();
		System.out.println("Names count: " + num.size());//4
		System.out.println("Names count: " + names.size());//6
		
		//System.out.println(names.toString());
		
		

	}

}
