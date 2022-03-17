package repl.repl_it.repl2;

public class MethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    int a = max(1,10);
//		System.out.println(a);
		  

		  
		   System.out.println(max(1,10));
		   System.out.println(max(11,5));
		
		
		
	}
	public static int max(int x,int  max)
	  {
	    if(x>max){
	      return max;
	    }else{
	      return x;
	    }
	    
	  
	  }

}
