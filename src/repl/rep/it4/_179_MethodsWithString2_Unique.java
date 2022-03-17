package repl.rep.it4;

public class _179_MethodsWithString2_Unique {

	public static void main(String[] args) {
		//test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    
	    String unique = "";
	    // go through each character, if it's not already contain in unique variable
	    // then wee add them to unique variable
	    
	    for(int i=0; i<=str.length()-1; i++){
	      
	    	String currentChar = str.substring(i, i+1);
	      if(!unique.contains(currentChar)){
	    	  unique += currentChar;
	      }
	      
	    }
	    return unique;
	  }

	}


