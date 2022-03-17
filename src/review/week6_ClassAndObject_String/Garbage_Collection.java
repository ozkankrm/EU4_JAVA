package review.week6_ClassAndObject_String;

public class Garbage_Collection {

	public static void main(String[] args) {
		
//		process of cleaning up unused objects from the heap memory
//		unreference olan objectler garbage collection i�in uygun olurlar.
//		iki y�ntemle olabilir
		
//		1 c1 = null;
		Computer c1 = new Computer();
				 c1 = null; // c1 available for garbage collection 
		
		Computer c2 = new Computer();	
		
		 c1 = c2; // c1 na c2 nin referencan� atad�k ve c1 an�n objecti unreference oldu
		
		 System.out.println("The ennd ");
		

	}

}
