package review.week5_methodPractice;

public class MethodWithReturn_FahCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double f = 100;
//		double c = (f-32)*5/9;
//		System.out.println(c);
		
		
	double tempInVA = 	farenheitToCelcius(54.9);
		
		System.out.println("54,9 Farenheit in US is " + tempInVA + " celcius in EU");
		
		System.out.println( farenheitToCelcius(81)    );
		
	}
	// temperatur converte F--> C
	// C= (F-32)*5/9
	
	
//	return keyword has 2 usage :
	// return a value out of a method that return a value
	// exit the method early (ANY METHODS including void method)
	public static double farenheitToCelcius(double f) {
		
		double c = (f-32)*5/9;
		
		return c;
//		System.out.println(); NO WE CAN NOT ! BECAUSE IT WILL BE UNREACHABLE CODE
	}

}
