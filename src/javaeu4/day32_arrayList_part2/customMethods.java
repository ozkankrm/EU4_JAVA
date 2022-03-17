package javaeu4.day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList);
		
		ArrayList<Double> doubList = new ArrayList<>();
		doubList.add(10.33);
		doubList.add(1.22);
		doubList.add(7.34);
		doubList.add(3.55);
		doubList.add(4.76);

		double sum = sumList(doubList);// retunlu method ve olu�tur ve bir parametreli
		System.out.println(sum);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(20); // return type ArrayList olacak // 20 arrayListin size d�r
		System.out.println(list.toString());
		
		ArrayList<Integer> rlist = getRandomList(20);// create arraylist in method
		System.out.println(rlist.toString());
		
		ArrayList<String>strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted); // [123, 33, 12]
		
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(String str : strList) {
			
			newList.add(Integer.parseInt(str)); 
		}
		return newList;
		
		
	}

	public static ArrayList<Integer> getRandomList(int num) {
		
		Random rn = new Random();
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=1; i<=num; i++) {
			newList.add(rn.nextInt(101)); // 101 --> 1 -100 aras�ndaki say�lardan rastgele se�ecek
			
		}
		return newList;
	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=1; i<=size; i++) {
			newList.add(i);
			
		}
		
		return newList;
	}

	public static double sumList(ArrayList<Double> d) {
		double sum = 0;
		for(Double value : d) {
			
			sum += value;
		}
		return sum;
	}

	public static void printList(ArrayList<Integer> nums) {
		
		for(Integer value : nums) {
			
			System.out.println(value);
		}
		
	}

}
