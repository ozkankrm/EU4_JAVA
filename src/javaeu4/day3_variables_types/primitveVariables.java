package javaeu4.day3_variables_types;

public class primitveVariables {

	public static void main(String[] args) {
		String name = "Dady"; // �ift t�rnak i�rati kullan�l�r.
		System.out.println("He is name : " + name);
		
		
		byte b1 = 25;
		byte b2 =-25;
		//byte b3 = 128; byte kapasitesini ge�ti�i i�in �al��maz max 127 olabiliyor
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000; // underscore for read easly 
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		long l1 = 1790333333;
		long l2 = -2309876498L; // yaz�lan rakam int ten b�y�k oldu�u i�in sonua L veya l yazarak long oldu�u belirtiriz 
		long creditCardNumber = 1224_4567_2345_0987l;
		
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		System.out.println("l1 = " + l1);
		
		float f1 = 2.1f; // sonuna f  veya F koyarak float oldu�u tan�mlan�r
		double d1 = 3.14;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		char c1 = 'A';
		char c2 = 65; //decimal value corresponding to character 'A'
		
		System.out.println(c2);
		
		boolean status = true;
		boolean status2 = false;
		System.out.println("Eligible to take the exam: " + status);
		
		
	}

}
