package javaeu4.day31_arrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {


		ArrayList<String>cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());  // [London, Virginia, DC, Baku, Berlin, Baku]
		
		// print each city by using for-each loop seperated by space
		
		for(String city : cities) {
			
			//System.out.println(city + " ");
			System.out.println(city);
			
		}	
		
		// Print each city by using for-iterator loop
		System.out.println("*************************************");
		for(int i=0; i<cities.size(); i++) {
				
				System.out.println(cities.get(i));
			}
		System.out.println("-----------------------------");
		
		System.out.println("Removing Baku");
		cities.remove("Baku"); // birden fazla baku varsa ilk s�rakini kald�r�r. di�erlerine dokunmaz
		cities.remove("New York");
		
		System.out.println(cities.toString());
		System.out.println("-----------------------------");
		
		cities.add(0, "Arlington");// index 0 ra bunu atayacak ve eskileri sa�a kayd�r�r
		cities.add(1, "Istanbul");// istanbulu index 1 ekleyecek ve 1 deki eleman� index 2 ye aktaracak.
		cities.add(2, "Ankara");
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Istanbul"); // give index of istanbul
		System.out.println(idx);
		
		// if not in list return -1
		System.out.println(cities.indexOf("Bursa"));// -1
		
		System.out.println("-----------------------------");
		
		cities.clear();// t�m listeyi sildik
		boolean empty = cities.isEmpty();// true // bo� oldu�u i�in true olur.
		System.out.println(empty);
		
		}
		

	}


