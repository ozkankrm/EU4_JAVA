package javaeu4.day11_controlFlowStatementPart5_ForLoop;

public class ForLoop_DifferentDataType_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		farkl� data typler� for loop i�inde birlikte kullanmay�z
//		ancak loop un d���nda atamas�n� yapt�ktan sonra loop un i�inde kullanabiliriz
		
		long y = 0;
		int x = 0;
		for( y = 0,  x = 0; x < 5 && y < 10; x++, y++) {
			System.out.println(y + " " + x);
		}
		
		System.out.println(x);
	}

}
