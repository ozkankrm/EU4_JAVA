package repl.repl_it.repl2;

import java.util.Scanner;

public class FibonacciWithMethod_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Complete a method fib() that will compute Fibonacci numbers
		Complete a method fib() that will compute Fibonacci numbers
		In Fibonacci series, next number is the sum of previous two numbers 
		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,��...
		The first two numbers of the Fibonacci series are 0 and 1.
		You are given a number num, print n-th Fibonacci Number.
	
	*/
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		fib(num);
		
	}

	public static void fib(int num) {
		
		int a=0;
		int b=1;
		
		for(int i=1; i<num; i++) {
			
			
			
			int sum = a+b;
			a=b;
			b=sum;
		
		}
		System.out.println(b);// do�rudan girilen say�n�n ka�a denk geldi�ini sordu�u
							//i�in for un d���nda yazd�rd�k	
							// e�er tek tek isteseydi for un i�ine yazd�r�rd�k
	}

}
