package javaeu4.day17_ClassObjectsPart2;

public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println(b1.make); //BMW
		System.out.println(b2.make);//BMW --CLASSTA VERD���MZ DE�ER HPS�NE AKTARILDI

		b1.make = "BMW2019";
		System.out.println(b1.make); //BMW2019 b1.make yeni de�er atad�k
		
		System.out.println(b2.make);//BMW // eski de�er devam eder. daha de�i�medi
	
		System.out.println(b1.model);// null -- de�er atanmam��
		
		b1.model = "m3";
		
		System.out.println(b1.model);// m3
	
		b1.showPrice();
		
		
		b2.model = "x3";
		b2.showPrice();
	}

}
