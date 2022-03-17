package review.week5_methodPractice;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RECRUC�ON: a method calling itself :  BUT WHY
		
		//infinite 
		// s�rekli kendisini �a��r�p durur ve say� 1 azalarak
	
		printNumber(10);
		
	}

	public static void printNumber(int n) {
		
		if(n==0) { // burdaki ko�ulla inifinite olmaktan ��kar ve n=0 oldu�unda
			System.out.println("THE END!!");
			return; //sistemden ��kar
		}
		
		System.out.println(n);
		
//		call printNumber with different number below
//		for example one less than the value of n
		printNumber(n-1);
	}

}
