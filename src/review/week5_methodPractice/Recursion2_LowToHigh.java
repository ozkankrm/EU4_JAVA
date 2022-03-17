package review.week5_methodPractice;

public class Recursion2_LowToHigh {

	public static void main(String[] args) {
		
		printNumber(-10);

	}

//	count until 10 from num
public static void printNumber(int num) {
		
		if(num>10) {
			System.out.println("THE END!!");
			return; //sistemden ��kar
		}
		
		System.out.print(num + " ");
		
//		call printNumber with different number below
//		for example one less than the value of n
		printNumber(num+1);
	}

}
