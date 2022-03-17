package javaeu4.day48_collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		items2.add(10);
		
		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49); //put() same add()
		items.put("flowers", 10.99);
		items.put("Eggs", 6.0);
		items.put("Milk", 4.99);
		items.put("Cherries", 5.99);
		
		System.out.println(items.size());
		System.out.println(items.toString());
		System.out.println(items.isEmpty());
		System.out.println(items.get("Apple"));//give apple value
		System.out.println(items.get("Milk"));//give apple value
		
		items.remove("flowers");
		
		System.out.println(items.size());
		System.out.println(items.toString());
		
		System.out.println("Is Apples there? " + items.containsKey("Apple"));
		System.out.println("Is flowers there " + items.containsKey("flower"));
		
		items.replace("Eggs", 3.5);
		System.out.println("Price of Eggs: " + items.get("Eggs"));
		
		items.put("Milk", 2.6);
		System.out.println("Price of milk: " +items.get("Milk"));
		
		//increase price of cheries by $2
		
		items.replace("Cherries", items.get("Cherries") + 2 );
		
		//second way
		items.replace("Cherries", 5.99, 7.99);
		System.out.println(items.get("Cherries"));
		
	}

}
