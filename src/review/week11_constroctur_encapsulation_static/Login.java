package review.week11_constroctur_encapsulation_static;

public class Login {

	public static void main(String[] args) {

		// field deki instance variablere class ad� ile ula�amay�z obje olu�turmak gerekir
//		System.out.println(Credentials.userName);
		
	/*	Credentials obj1 = new Credentials();
		
		System.out.println("User name entered: " + obj1.userName);
		System.out.println("User name entered: " + obj1.passWord);
		
		System.out.println("===============================================");
		obj1.userName = "B123456";// re-assign yapt�k
		obj1.passWord = "789546";
		
		System.out.println("User name entered: " + obj1.userName);
		System.out.println("User name entered: " + obj1.passWord);
		*/
		
		Credentials obj2 = new Credentials();
		
		// gette ile private ula�t�k
		System.out.println("Username entered: " + obj2.getUserName());
		System.out.println("Username password: " + obj2.getPassWord());
		System.out.println("=======================================");
		
		obj2.setPassWord("cyber456");
		obj2.setUserName("cybertekSchool");
		
		System.out.println("Username entered: " + obj2.getUserName());
		System.out.println("Username password: " + obj2.getPassWord());

	}

}
