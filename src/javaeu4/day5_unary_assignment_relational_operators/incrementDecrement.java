package javaeu4.day5_unary_assignment_relational_operators;

public class incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y, x = 2;
		y = x++;               // burda x oldu�u gibi yaz�l�r yani 2 olur
		System.out.println(x); // 3, burda x 1 arm�� ve 3 olmu�
		System.out.println(y);// 2
		 
		
		int b=2;
		System.out.println(b++); //2
		
		int a =2;
		System.out.println(--a); //1
		
		int d, c=8;
		d= c--;
		System.out.println(d); //8
		

	}

}
