package javaeu4.day6_logicalOperators;

public class logicalOperators {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		//boolean res1 = (i1==i2)&&(c1==c2);// F && ------ F // ilkiF oldu�u i�in di�erini ge�mez ve di�erinin ne oldu�u �nemli de�il
		boolean res1 = (i1==i2)&(c1==c2);// F&T-->F
		System.out.println("res1 = " + res1);
		
		boolean res2 = (c1==c2) | (i1==i2); // T | F -->T
		System.out.println("result = " + res2);
		
		boolean res3 = (c1==c2) || (i1==i2); // T || ------- T// ilki T oldu�u i�in di�eri �nemli de�il
		System.out.println("result = " + res3);
		
		boolean res5 = (c1==c2)^(i1==i2); // T^F-->T
		System.out.println("result = " + res5);
		
		boolean res6 = (c1==c2)^(i1!=i2); // T^T-->F
		System.out.println("result = " + res6);
		
	
	}
	

}
