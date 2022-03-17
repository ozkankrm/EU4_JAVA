package assignments.Assignmet_9;

public class Question_4 {

	public static void main(String[] args) {


		String word = "fifteen";
		
		if(word.length()<5) {
			System.out.println("Invalid");
		}
		else if(word.length()%2!=0 && word.length()>=5) {
			
			word = word.substring(word.length()/2-1, word.length()/2+2);
			
			System.out.println(word);
		}
		

	}

}
