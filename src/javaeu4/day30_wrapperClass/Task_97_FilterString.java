package javaeu4.day30_wrapperClass;

public class Task_97_FilterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "(((W&e**_lco74me %t%o co!@$,,<r>e <J>>>$@av'''*a777.||}{";
//		Write a method that returns : Welcome to core Java
		
		String s = "(((W&e**_lco74me %t%o co!@$,,<r>e <J>>>$@av'''*a777.||}{";
		
		
		System.out.println(filterString(s));
		
	}
	
	public static String filterString(String s1) {
		
		String dummy = "";
		for(int i=0; i<s1.length(); i++) {
		
			if(Character.isAlphabetic(s1.charAt(i)) || s1.charAt(i) == ' '){
			
				dummy += s1.charAt(i);
				
			}
		
		}
	
		return dummy;
	}

}
