package javaeu4.day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingAList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		System.out.println("After sorting");
		Collections.sort(list);
		System.out.println(list.toString());
		
		
	//	Product prd = new Product("Knife", 400);
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product("spoon", 13.99));
		prodList.add(new Product("bag", 100.00));
		prodList.add(new Product("shoes", 59.99));
		prodList.add(new Product("spoon", 13.99));
		
		System.out.println("Before  sorting");
		System.out.println(prodList.toString());
		
		Collections.sort(prodList);
		
		System.out.println("After  sorting");
		System.out.println(prodList.toString());//düşük fiyattan yükseğedoğru sort yaptı
		
		
		Product prd1 = new Product("spoon", 25.34);
		Product prd2 = new Product("chair", 7.99);
		System.out.println(prd1.compareTo(prd2));

	}

}
