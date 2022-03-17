package assignments.Assessment_4;

public class Question_17 {

	public static void main(String[] args) {
		
		String str = "";
		
		int k = m1(str.length());//buras� 0 ama return ++i dan  dolay� 1 olur
		
		k +=3 + ++k; // k = 1+3 + 2 =6
		
		System.out.println(k);

	}
	public static int m1(int i) {
		return ++i;
	}

}
