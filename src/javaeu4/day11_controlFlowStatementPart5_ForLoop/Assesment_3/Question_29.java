package javaeu4.day11_controlFlowStatementPart5_ForLoop.Assesment_3;

public class Question_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount=10;
		String result = amount<=2 ? "couple" : amount>2 && amount <=5 ? "few" : amount<=5 ? "sevreal" : "many";
		System.out.println(result);
	}

}
