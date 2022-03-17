package javaeu4.day15_methodOverloading;

public class Assignment1_SwapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		solution-1 by using 3rd variable
		int n1 = 10;
		int n2 = 20;
		int n3;
		
//		n3 = n1;
//		n1=n2;
//		n2=n3;
//		
//		System.out.println("n1: " +n1);
//		System.out.println("n2: " + n2);
		
//		solution without using 3rd variable
//		birbirne ekleme ve ��karma y�ntemi ile
		
		n1=n1+n2;//10+20=30
		n2=n1-n2; //30-20=10-->n1
		n1=n1-n2;// 30-10020-->n2
		
		System.out.println("n1: " +n1);
		System.out.println("n2: " + n2);
		
		

	}

}
