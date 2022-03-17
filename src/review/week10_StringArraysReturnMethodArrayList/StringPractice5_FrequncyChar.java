package review.week10_StringArraysReturnMethodArrayList;

public class StringPractice5_FrequncyChar {

	public static void main(String[] args) {
		/*
		 * frequency of one character
		 * 
		 * 
		 */
		
		String str = "aaaabbbbacaca";
		
		int count = 0;
		
		String[] arr = str.split("");
		
		for( String each : str.split("")) {
			
			if(each.equals("a")){
				count++;
			}
		}
		System.out.println(count);

	}

}
