package javaeu4.day23_RandomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());// her �al��t�rd���m�z random olarak numara verir
		
		System.out.println(rn.nextDouble());//0.0 ile 1.0 aras�nda rastgele say� verir
	
		System.out.println(rn.nextFloat());//0.0 ile 1.0 aras�nda rastgele say� verir
		
		System.out.println(rn.nextBoolean());// false, true rastgele verir. bazen true bazen false
		
		System.out.println(rn.nextInt(10)); // 0-9 aral���nda verir 9 dahil ama 10 dahil de�il
		
		System.out.println(rn.nextInt(50));// 0-49
		
//		 5-15 aral��� i�in +5 ekle
		System.out.println(rn.nextInt(10)+5 ); // 5-14 
	
	}

}
