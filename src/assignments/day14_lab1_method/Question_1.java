package assignments.day14_lab1_method;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a method that accepts a string and a non-negative number, 
//		and prints a larger string that is number copies of the original String
//
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);
	}

	public static void stringTimes(String str, int num) {
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
//		 second way
		String str1 = "";
		for(int i=1; i<=num; i++) {
			str1 = str1 + str;
		}
		System.out.println(str1);
	}

}
