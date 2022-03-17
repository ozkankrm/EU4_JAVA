package javaeu4.day47_collection_part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoopSet {

	public static void main(String[] args) {
		

		Set<Integer> numsSet = new HashSet<>();
		
		numsSet.add(50);
		numsSet.add(543);
		numsSet.add(1150);
		numsSet.add(550);
		numsSet.add(570);
		numsSet.add(93);
		numsSet.add(5000);
		numsSet.add(950);
		
		for(Integer n : numsSet) {
			System.out.print(n+" | ");
		}
		
		numsSet.forEach(n -> System.out.print(n+" | "));

	}

}
