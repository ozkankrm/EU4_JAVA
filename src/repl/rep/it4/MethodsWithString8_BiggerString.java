package repl.rep.it4;

public class MethodsWithString8_BiggerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String biggerS(String a ,String b)
	  {
	   
	   String longest;
	   if(a.length()>b.length()) {
	        longest = a;
	   
	  }else{
	    longest = b; 
	  }
	  return longest;
	}

}
