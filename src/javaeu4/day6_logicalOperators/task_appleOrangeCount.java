package javaeu4.day6_logicalOperators;

public class task_appleOrangeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp = applesCount<orangesCount||orangesCount>=pearsCount;
		//20<30 || 30>=30 -->T || -----= T
		System.out.println(comp);
	}

}
