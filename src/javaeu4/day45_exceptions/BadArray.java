package javaeu4.day45_exceptions;

public class BadArray {

	public static void main(String[] args) {
		
		int[] number = {1,2,3};
		
		//index number=3, i<=number.length=4 yapar we index 0,1,2 yi yazdırır index 3 te hata verir ve sonraki line yazdırımaz
		//orda durur
		for(int i=0; i<=number.length; i++) {
			System.out.println(number[i]);
		}
		
		//bu satırı yazdırmaz. çünkü buraya ulaşamıyor
		System.out.println("Learning exception");

	}

}
