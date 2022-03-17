package review.week10_StringArraysReturnMethodArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.addAll(Arrays.asList(1,2,3,4,5,6,7));
		
		System.out.println("Size is: " +list1.size());
		
		list1.add(0, 20);// o elemete 20 atad�k
		list1.add(30);// sonuna 30 ekledik
		
		list1.set(2, 100);// 2 deki elemente reassign yapt�k ve de�i�ti.
		System.out.println(list1);
		
		System.out.println(list1.get(5));
		
		System.out.println("======================================");
		/*
		 * remove dublicated from arrayList
		 */
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1,1,2,2,3,3));
		
		ArrayList<Integer> nonDup = new ArrayList<>();
		
		for(int each : list2) {
			if(!nonDup.contains(each)) {
				nonDup.add(each);
			}
		}
		System.out.println(nonDup);
		
		System.out.println("======================================");
		
		Integer[] numbers = {10,10,10,20,20,30,10,30,40,40,50};
		
		ArrayList<Integer> result = new ArrayList<>();//[10,20,30,40,50]
		
		for(int each : numbers) {
			if(!result.contains(each)) {
				result.add(each);
			}
		}
		System.out.println(result);
	}

}
