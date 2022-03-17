package assignments.Assignmet_9;

public class Question_15 {

	public static void main(String[] args) {
		
		String str = "cat-cheetah-dog-cat";
		int countCat = 0;
		int countDog = 0;
		
		for(int i=0; i<str.length()-2; i++) {
		if(str.substring(i, i+3).equalsIgnoreCase("cat")) {
			countCat++;
		}
		if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
			countDog++;
		}
		
		}
		
		boolean b = countCat==countDog;
		System.out.println(b);
			
		}
	}


