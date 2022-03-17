package javaeu4.day48_collection_part3;

import java.util.HashSet;
import java.util.Set;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		//create set collection and add new products
		
		Set<Product> proSet = new HashSet<>();
		
		proSet.add(new Product("book", 25.99));
		proSet.add(new Product("book", 17.99));
		proSet.add(new Product("magazine", 7.99));
		
		System.out.println(proSet.toString());
		
		System.out.println();
		
		//print each of them
		for(Product each : proSet) {
			System.out.println(each);
			System.out.println(each.getPrice());
		}
		
		//print each product by using forEach method
		
		proSet.forEach(m->System.out.println(m));
		
		proSet.forEach(m->System.out.println(m.getName()));
		
		
			

		
	}

}
