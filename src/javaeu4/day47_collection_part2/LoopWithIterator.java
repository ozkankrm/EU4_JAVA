package javaeu4.day47_collection_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LoopWithIterator {

	public static void main(String[] args) {
		

		List<Integer> nums = new ArrayList<>();
		
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//create ıterator object
		Iterator<Integer> it = nums.iterator();
		
		//call hasNext method
		//hasNext return true, if there is still next value
		//returns false when it reaches the end or empty
		
		System.out.println("it.hashNext() : " + it.hasNext());
		
		System.out.println("it.next() : " + it.next());//elementi verir
		System.out.println("it.next() : " + it.next());
		System.out.println("it.next() : " + it.next());//
		
		System.out.println("=========");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//System.out.println("it.next() : " + it.next());//hata verir
		
		Iterator<Integer> it2 = nums.iterator();
		
		//what is the difference between for each and iterator
		//we can remove objects while loopig
		
		while(it2.hasNext()) {
			int val = it2.next();
			if(val>1000) {
				it2.remove();
			}
		}
		System.out.println(nums.toString());
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Viriginia");
		cities.add("DC");
		
		//you cannot remove object with for each loop
		for(String city : cities) {
			if(city.equals("Boston")) {
				cities.remove(city);
			}
		}
	}

}
