package javaeu4.day47_collection_part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		System.out.println(mySet.toString());
		System.out.println(mySet.size());//5--> dublicate olanları 1 olaraak saydı
		
		//
		//for each kullanırız
		for(Integer each :  mySet) {
			System.out.println(each);
		}
		
		List<String> list  = Arrays.asList("23","23","a","a","bb","jj","q","t","t");
		
		Set<String> unique = new HashSet<>(list);
		
		System.out.println(list.toString());//hepini yazdırır//[23, 23, a, a, bb, jj, q, t, t]
		System.out.println(unique.toString());//double olandan bir tane yazdırır//[bb, jj, 23, a, q, t]
		
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(500);
		tSet.add(100);
		tSet.add(10);
		tSet.add(5);
		tSet.add(8000);
		tSet.add(100);
		
		System.out.println(tSet.toString());
	}

}
