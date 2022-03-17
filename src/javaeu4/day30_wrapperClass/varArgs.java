package javaeu4.day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		
//		int.. --> vararg parameter
//		A vararg parameter can take a variable number of arguments 
//		overloading mant���n� yap�yor. farkl� parametrelerde �al���yor
		sum(2,4);
		sum(2,4,5,7,9);
		sum(2,4,10,20,35,50);

	}
	
	public static void sum(int...numbers) {//int...  -->int ten sonra 3 nokta koyunca array yap�yor
		
		int sum = 0;
		
		for(int value : numbers) {
			sum += value;
		}
		System.out.println(sum);
	}

}
