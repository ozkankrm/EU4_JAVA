package javaeu4.day45_exceptions;

public class Try_Catch {

	public static void main(String[] args) {
		
		
		try {
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));// ı might have problem here//bunu çalıştırmaz çünkü index 5 yok
			System.out.println(str.charAt(1));// buraya ulaşmaz

		
		}catch(Exception e) {//catch bloğu eğer try da hata varsa run olur yoksa run olmaz
			
			System.out.println("Exception happened in try block and was cought");
			//EXCEL
			
		}
		
		System.out.println("After try catch block");
		

		/*
		String str = "JAVA";
		System.out.println(str.charAt(0));// bunu yazar
		System.out.println(str.charAt(5));// bunu yazdırmaz çünkü index 5 yok ve burda durur.
		System.out.println(str.charAt(1));//buraya ulaşamaz
		*/
	}

}
