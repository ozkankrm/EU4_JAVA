package javaeu4.day14_valueReturn;

public class ValueReturn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodName(6, "apple");
		
		int x = methodName(6, "apple");
		
		System.out.println(x);
		
		System.out.println(methodName(10, "orange"));
		
		int y = methodName(20, "apple")%2; // burda i�lemler yapabiliriz
		if(methodName(6, "apple")%2==0) {
			//even
		}else {
			//odd
		}
		
	}
	
	public static int methodName(int n1, String str) {
		
		System.out.println(str);
		
		int sum = 4 + n1;
		
		return sum;
	}

}
