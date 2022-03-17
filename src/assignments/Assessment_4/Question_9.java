package assignments.Assessment_4;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("|" + FunCharSeq(" W ").concat("W") + "|" );// |W0W|

	}
	
	public static String FunCharSeq(String str) {
		str = str.trim();
		str += "0";
		
		return str;
		
	}

}
