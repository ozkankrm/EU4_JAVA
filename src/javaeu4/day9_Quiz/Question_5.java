package javaeu4.day9_Quiz;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		int y = x * 4- x++;
		
		if ( y<10) {
			System.out.println("Too low");
		}else if(y>10 && y<=15) {
			System.out.println("Just Right");
		}else {
			System.out.println("Too high");
		}
		
	}

}
