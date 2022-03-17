package assignments.Assessment_4;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String space =" ";
		String composite = space +"hello" + space + space;
		composite.concat("world");// bunun s�rece bir etkisi yok
		
		String trimmed = composite.trim(); // burdaki composite Strinden geliyor
											// trim ba�kati ve sondaki spacelerisilir. 
											// sadece hello kal�r
		System.out.println(trimmed.length());//5
	}

}
