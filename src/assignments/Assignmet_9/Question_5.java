package assignments.Assignmet_9;

public class Question_5 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "wow";
		
		if(s1.length()!=s2.length()) {
			System.out.println("cannot merge");
			
		}else {
		
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");
		
		int length = (str1.length>str2.length) ? str1.length : str2.length;
		
		String combine = "";
		for(int i=0; i<length; i++) {
			
			combine += str1[i] + str2[i];
		}
		System.out.println(combine);
				
	}
	}

}
