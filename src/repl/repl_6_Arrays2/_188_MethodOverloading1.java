package repl.repl_6_Arrays2;

public class _188_MethodOverloading1 {


	public static void main(String[] args) {
		/*
		 * In this task, you need to write 2 methods findMax() that will find a maximum number in the array. 
		 * First method should work with array of integers (int[]) and return int, and second method should work 
		 * with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
		 */

	}

	
	public static int findMax(int[] x){
	    int max = 0;
	    for(int i=0; i<x.length; i++){
	      if(x[i]>max){
	        max = x[i];
	      }
	    }
	    return max;
	  }
	  public static double findMax(double[] d){
	    double max = 0;
	    for(int i=0; i<d.length; i++){
	      if(d[i]>max){
	        max = d[i];
	      }
	    
	   
	  }
		return max;
	  
	  }  
	  
}
