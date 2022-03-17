package review.week10_StringArraysReturnMethodArrayList;

public class StringPractice6_UniqueChar {

	public static void main(String[] args) {
		// unique char
		// seen one time in the string
		
		String str = "ababaaacbbdde";
		String uniques = "";

		for(char ch : str.toCharArray()){
			
			int count = 0;
			for(char each : str.toCharArray()) {
				if(each == ch) {
					count++;
				}
				
			}
			if(count==1) {
				uniques += ch;
			}
		}
		
		System.out.println(uniques);
	}

}
