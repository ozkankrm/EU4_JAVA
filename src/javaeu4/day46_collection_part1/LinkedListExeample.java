package javaeu4.day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExeample {

	public static void main(String[] args) {


		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(200);
		list.add(5000);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println((((LinkedList<Integer>) list).getFirst()));//casting yaptık. get.First() methodu sub classta ve ona ulaşmak 
								//için cast yapmak gerek
		//get.First()-->LinkedList e ait specific methoddur
		//addFirst()
		//addLast()
		
		((LinkedList<Integer>) list).addFirst(1);
		((LinkedList<Integer>) list).addLast(99);
		
		
		
	}

}
