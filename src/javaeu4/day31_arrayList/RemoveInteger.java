package javaeu4.day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {


		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());// 0 // nothing assign yet
		
		System.out.println(nums.isEmpty());// true
		
		System.out.println(nums.size()==0);// true
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());// [4, 1, 44, 5, 10, 100, 55]
		
		nums.remove(5);// index 5 teki element kald�r�l�r.( index 5 = 100 silinir)
		System.out.println(nums.toString()); // [4, 1, 44, 5, 10, 55]
		
		// spesifik bir rakam� kald�rmak istiyorsan �nce objeye �evir sonra remove yap
		Integer n1 = new Integer(5);// converting primitive to object
		Integer n2 = Integer.valueOf(5);// Integer de�eri �nce obeye �evirdik 
		
		nums.remove(n1);// direk objeyi kald�rtabiliriz.(burda 5 yi kadl�rd�k)
		System.out.println(nums.toString());// [4, 1, 44, 10, 55]
		
		nums.remove(new Integer(4));// 4 rakam�n� burda objye d�n��t�rd�k ve kald�rd�k
		System.out.println(nums.toString());//[1, 44, 10, 55]
		
		
		

	}

}
