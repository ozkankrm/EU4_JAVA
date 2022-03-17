package javaeu4.day16_classObject;

public class Communicate {

	public static void main(String[] args) {
	
		Contact con = new Contact();
		
		con.name = "Alison";
		con.phoneNumber = "123456789";
		con.email = "ornek@gmail.com";
		
		System.out.println(con.name);
		System.out.println(con.phoneNumber);
		System.out.println(con.email);

		con.call();
		con.sendMessage();
		con.sendEmail();
		
	
	
	
	}

}
