package javaeu4.day19_StringClass_Manipulation;

public class Task_79_PrintVowel {

	public static void main(String[] args) {
		
//		Write a program to print only vowel (a,e,o,i,u) in given string
//		String word = "CybertekSchool";
//		Output: e,e,o,o
//		
	String word = "CybertekSchool";
		
	for(int i = 0; i<word.length(); i++) {
			
		if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='i'
				|| word.charAt(i)=='u') { // char letter = word.charAt(i); yap�larak letter ile den yap�labilir
				
				System.out.print(word.charAt(i));
				
				if(i !=word.length()-2) {
					System.out.print(",");
				}
			}
			
		}
		
		
		}

	
	}


