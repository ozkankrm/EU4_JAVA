package javaeu4.day45_exceptions;

public class Checked_Unchecked_Exceptions {

	public static void main(String[] args) {
		
		// ya try..catch.. ile handle edersin
		//veya throws import edersin
	//	Thread.sleep(2000);// hata verir// 1. import at/ 2. handle 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
