package javaeu4.day31_arrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		System.out.println(list2.toString());//[Jan, Feb, Mar, Apr, May]
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<>(list1);// months a list1 assign ettik
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months); // months �nce list1 idi sonra add olanlar� sona ekledi
									//[Jan, Feb, Mar, Apr, May, Jun, July, Aug]
		
		
		// contains()-->true/false
		System.out.println(months.contains("Jan"));// true
		System.out.println(months.contains("Dec"));// false
		
		// hov to check Feb is in second position
		System.out.println(months.indexOf("Feb")==1);

		System.out.println(months.get(1).equals("Feb"));
		
		
		list1.add("Jan");
		System.out.println("List1: " + list1);
		System.out.println("Months: " + months);
		//containsAll()--> Stringin t�m elemanlar�n i�inde olup olmad���n� check eder.
		if(months.containsAll(list1)) { // list1 deki t�m elementlerin months da olup olmad���n� check eder.
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		}
		
		}	
		
	


