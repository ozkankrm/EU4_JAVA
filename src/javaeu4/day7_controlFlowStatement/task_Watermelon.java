package javaeu4.day7_controlFlowStatement;

public class task_Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		boolean b;
		b=false;
		
		a=40;
		
		if (a>=40) {
			System.out.println("I have more than watermelon");
			b=true;
		}
		
		if(b) {
			System.out.println("Good job");
		}
		
		if(b==false) {
			System.out.println("I need more watermelon");
		}
	}

}
