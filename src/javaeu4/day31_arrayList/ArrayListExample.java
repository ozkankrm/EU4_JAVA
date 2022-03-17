package javaeu4.day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Languages
		// Print size arraylist
		//Read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		//creating arraylist
		languages.add("English");
		languages.add("Spanish");
		languages.add("Turkish");
		languages.add("France");
		languages.add("Russi");
		languages.add("Java");
		
		//size()
		System.out.println("Number of values: " +languages.size());//6
		System.out.println(languages.toString());// [English, Spanish, Turkish, France, Russi, Java]
		
		// read by get() method
		System.out.println(languages.get(0));
		
		languages.add("Russia");// bunu sona ekleyecektir
		System.out.println(languages.toString());//[English, Spanish, Turkish, France, Russi, Java, Russia]

		languages.remove(0);// 0 indexteki elementi kald�racak
		System.out.println(languages.toString());// [Spanish, Turkish, France, Russi, Java, Russia]
		
		System.out.println("Number of values: " + languages.size());
	}

}
