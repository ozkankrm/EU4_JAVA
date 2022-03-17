package javaeu4.day13_methods_Part1;

public class CreditCardMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary = 50000;
		int creditRating=5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();// �nce burda yaz sonra �st�ne gel ve creat metdo i�aretle
		}else {
			noQualify();
		}
	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualify for the CC");
		
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");
		
	}
	
	

}
