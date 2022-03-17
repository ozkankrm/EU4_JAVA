package javaeu4.day31_arrayList;

public class Task_98 {

	public static void main(String[] args) {

		/*
		 * String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	        System.out.println(decodeTheCode(str1));

	        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
	        
		 * Change the implementation of decodeTheCode(String) method such that on executing class,
following output is shown:
1 2 5 6
9 3 4
		 */
		 String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	        System.out.println(decodeTheCode(str1));

	        
	        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
	        
	        System.out.println(decodeTheCode(str2));
	     
	}

	private static String decodeTheCode(String s) {
		
		String dummy = "";
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)== ' ') {
				
				dummy += s.charAt(i);
				
			}
		}
		
		String[] arr = dummy.split(" ");
		
		String dummy2 = "";
		for(String value : arr) {
			
			dummy2 += getDigit(value) + " ";
		}
		return dummy2;
	}

	private static String getDigit(String st) {
		
		switch(st.toUpperCase()) {
		
		case "ZERO":
			return "0";
		case "ONE":
			return "1";
		case "TWO":
			return "2";
		case "THREE":
			return "3";
		case "FOUR":
			return "4";
		case "F�VE":
			return "5";
		case "S�X":
			return "6";
		case "SEVEN":
			return "7";
		case "E�GHT":
			return "8";
		case "N�NE":
			return "9";
		default:
			return "";
		}
	
	}

}
