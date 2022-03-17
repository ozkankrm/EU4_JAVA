package javaeu4.day46_collection_part1;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {


		int[] numsArray = {30,50,100,5,6};
		
		String[] days = new String[7];
		
		Object[] obj = {2, "apple", false};
		
		ArrayList<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>(); //List classı ArrayListin super clasıdır ve poly var burda
		Collection<Integer> list3 = new ArrayList<>();

		list1.add(44);
		list1.add(50);
		list1.add(100);
		System.out.println(numsArray[0]);
		System.out.println(list1.get(0));

		int[] numsArray1 = {30,50,50,100,5,6};



		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(30);
		list4.add(50);
		list4.add(50);
		list4.add(10);

		System.out.println("list4.size() = " + list4.size());//4
		System.out.println("list4.stream().distinct().count() = " + list4.stream().distinct().count());//3

	}

}
