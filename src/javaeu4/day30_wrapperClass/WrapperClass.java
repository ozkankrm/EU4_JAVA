package javaeu4.day30_wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");// string gibi d���nebiliriz ve double quote i�ine al�nabilir
		
		Character c = new Character('c'); // does not except double quote
		
		Byte bt = new Byte((byte)123);// byte casting kullan�l�r
		Byte bt2 = new Byte("123");
		
		Short s1 = new Short((short)1202);
		Short s2 = new Short("1202");
		
		Integer i1 = new Integer(1205);
		Integer i2 = new Integer("1205");
		
		Long l1 = new Long(200000000);
		Long l2 = new Long("200000000");
		
		Float f1 = new Float(12.2f);
		Float f2 = new Float("12.2");
		
		Double d1 = new Double(3.14);
		Double d2 = new Double("3.14");
		
		//primitive data b�y�k harf ile ba�larsa class olurlar ve onlarla object olu�turuur
		int n1 = 10;// n1 primitve
		System.out.println(n1);
		
		Integer n2 = new Integer (10);// n2 object
		System.out.println(n2);
		
		//class yap�nca �ok fazla se�enek kullan�labilir
		
		double d4 = 44.5;
		Double d3 = new Double(44.5);
		Double d6 = new Double("44.5");// double object
		System.out.println(d4);
		System.out.println(d3);
		System.out.println(d6);
		System.out.println(d4+d3+d6);
		
		char ch1 = 'a';
		Character ch2 = new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		
		byte b3 = 100;
		Byte b4 = new Byte((byte)100);// casting byte yapmazsak int olarak alg�lar
		System.out.println(b3);
		System.out.println(b4);
		
		Integer num1 = Integer.valueOf(12345);// valueOf() methodunu kulland�k
		System.out.println(num1);
		
		Boolean bol1 = Boolean.valueOf(true);
		Boolean bol2 = Boolean.valueOf("false");
		System.out.println(bol1);
		System.out.println(bol2);
		

	}

}
