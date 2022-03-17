package review.Mat_review.self_review;

public class NTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(nTwice("hello", 2));
		
		System.out.println(withoutX("xHix"));
		System.out.println(withoutX("Hxix"));
	}
	public static String nTwice(String str, int n) {
		  
		str =  str.substring(0, n).concat(str.substring(str.length()-n));
		  

		  return str;
		}
	public static String withoutX(String str) {
		
		if(str.charAt(0) == 'x' && str.charAt(str.length()-1)=='x') {
			
		str = str.substring(1, str.length()-1);
		
		}
		else if(str.charAt(0) == 'x') {
			
			str = str.substring(1);
		}
		else if(str.charAt(str.length()-1)=='x') {
			
			str = str.substring(0, str.length()-1);
		}
		return str;
	}

}
