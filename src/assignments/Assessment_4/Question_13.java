package assignments.Assessment_4;

public class Question_13 {

	public static void main(String[] args) {

		String str = "JavaScript";
		System.out.println(getMsg(str)); // Input value must be smaller than x

	}
	
	public static String getMsg(String x) {
		
		String msg = "Input value must be ";
		msg = msg.concat("smaller than x");
		msg.replace("X", x); // re-assign olmad�klar� i�in programa etki etmez
		
		String rest = " and larger than 0";
		msg.concat(rest); //re-assign olmad�klar� i�in programa etki etmez
		
		return msg;
		
	}

}
