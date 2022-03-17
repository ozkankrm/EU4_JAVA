package assignments.Assessment_4;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "purr";
		
		s.toUpperCase();// bunlar s i etkilemez
		s.trim();// bunlar s i etkilemez
		s.subSequence(1, 3);// bunlar s i etkilemez
		s +=" two"; // buras� reassign olmu� ve etkiler
		
		System.out.println(s.length());//8
	}

}
