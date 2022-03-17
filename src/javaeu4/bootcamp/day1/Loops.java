package javaeu4.bootcamp.day1;

public class Loops {
	
	public static void main(String[] args) {
		
		
		for(int i = 1; i<6; i++) { //i++-->core related
			
			System.out.println("Hello");
			
		}
		
		System.out.println("=================================================");

		String str = "Hello";
					//01234
		
		String reversed = "";
		
		reversed += str.charAt(str.length()-1); //o
		
		for(int i = str.length()-1; i>=0; i--) { 
			
			reversed += str.charAt(i);
			
		}
		System.out.println(reversed);
		
		
	}
	
	
	
}
