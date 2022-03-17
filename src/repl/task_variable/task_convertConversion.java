package repl.task_variable;

public class task_convertConversion {

	public static void main(String[] args) {
		// 
		int t = 130;
		//byte e = t;
		
		byte e = (byte) t;
		System.out.println(e); // -126
		
		// data tpyler i birbirine d�n��t�rmek i�in valueName in ba��na parantez i�inde
		// data t�r� yaz�l�r.
		int number ;
		double dval = 32.33;
		number = (int)dval;
		System.out.println(number);
		
		int y;
		double x = 2.0;
	
		y= (int)x; // douubele de�erin ba��na int yazd�k ve sonu� int t�r�nden olur
		System.out.println(y); // 2
		
		double a;
		int b = 5;
		
		a=b; // double> int oldu�u i�in ve double int kapsad��� i�in g�n��t�r�yor.
		System.out.println(a);// 5.0

	}

}
