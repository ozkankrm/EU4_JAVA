package assignments.Assignmet_9;

public class Question_6 {

	public static void main(String[] args) {
	
		String str = "apple";
		
		if(str.length()<5) {
			System.out.println("Too short!");
		}
		if(str.length()>5) {
			System.out.println("Too long!");
		}
		else {
		
		String[] s = str.split("");
		
		String reverse = "";
		for(int i=s.length-1; i>=0; i--) {
			
			reverse += s[i];
		}
		System.out.println(reverse);

	}
	}
}
