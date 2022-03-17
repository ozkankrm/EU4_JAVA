package javaeu4.day9_Quiz;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 55;
		
		if(grade>40) {
			System.out.println("congrat");
			if(grade<60 || grade ==60) {
				System.out.println("You passed");
			}
		}else {
			System.out.println("You failed");
		}
	}

}
