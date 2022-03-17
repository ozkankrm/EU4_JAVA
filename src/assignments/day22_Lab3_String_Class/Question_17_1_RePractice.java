package assignments.day22_Lab3_String_Class;

public class Question_17_1_RePractice {

	public static void main(String[] args) {


		String str = "Taco cat";
		
		String dummy = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			dummy = dummy + str.charAt(i);
			
		}
//		if(str.equals(dummy)) {
//			System.out.println(true);
//		}
		
		// e�er iki word aras�nda bo�luk varsa �nce bo�lu�ur replace ile change et
//		e�er b�y�k k���k harf varsa ignorecase le ignore et
		
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}

}
