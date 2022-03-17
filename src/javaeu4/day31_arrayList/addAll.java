package javaeu4.day31_arrayList;

import java.util.ArrayList;

public class addAll {

	public static void main(String[] args) {

		//addAll();--> bir stringe di�erinin t�m elementlerini ekler

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("c#");
		l2.add("C++");
		
		l2.addAll(l1); // l2 ye l1 ekledi
		System.out.println(l2.toString());
		
		l1.addAll(l2); // l1 e l2 yi ekledi
		System.out.println(l1.toString());

	}

}
