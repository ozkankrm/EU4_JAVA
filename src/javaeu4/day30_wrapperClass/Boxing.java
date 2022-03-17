package javaeu4.day30_wrapperClass;

public class Boxing {

	public static void main(String[] args) {
		// AUTOBOXING-> PR�M�T�VE TO OBJECT
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;// n primitivini num2 objesine atad�k// n objeye d�n��t�
		
		//UNBOXING->ONJECT TO PR�M�T�VE
		Double d1 = new Double(34.2);
		double d2 = d1; // obje primitive d�n��t�
		System.out.println("d1 :" + d1);
		System.out.println("d2 :" + d2);
		
		long l1 = new Long(6000000L);//unboxing // obje primitive d�n��t�
		Long l2 = new Long(1244678876);// no boxing
		
		long l3 = l2; // unboxing
		
		int x = 345;
		double y = x;
		Integer num3 = Integer.valueOf(345);//creating object
//		Double dd = num3; // casting not possible with wrapper classes.
		
		//no boxing
		Integer num12 = 4;
		Integer num123 = num12;
		System.out.println(num12);
		System.out.println(num123);

	}

}
