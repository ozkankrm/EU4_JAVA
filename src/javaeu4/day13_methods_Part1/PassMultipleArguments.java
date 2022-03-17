package javaeu4.day13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showSum(5,10); // parantezin i�ine farkl� de�erler verebiliriz. ve form�l�m�z �al���r
		showSum(15,20);
		showSum(5,30);
	}
	
	public static void showSum(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
