package javaeu4.day36_staticClassMembers;

import static java.lang.Math.*;// import all static properties belongs to math class

public class StaticImport {

	public static void main(String[] args) {


		System.out.println(Math.sqrt(16));
		
		// yukarda static import eklede�imiz i�in class ismi 
		// olmadn methodu �a��rabiliyoruz.
		System.out.println(sqrt(16));
		
		System.out.println(PI);

	}

}
