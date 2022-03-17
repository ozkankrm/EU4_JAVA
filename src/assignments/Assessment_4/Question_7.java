package assignments.Assessment_4;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		String letters = "abcdesfg";
		
		total += letters.subSequence(1, 2).length();// 1
		total += letters.subSequence(6, 6).length();//0
		total += letters.subSequence(5, 6).length();//1+1=2
		
		System.out.println(total);//2
		
	}

}
