package repl.rep.it4;

import java.util.Scanner;

public class Methods9_isPost_154 {

	public static void main(String[] args) {
		/*
		 * isPos is a method that checks if  an int positive or not positive

1. If  the int num is positive print positive else print not positive

2. Complete main method by calling isPos method for each element in the array arr.


		 */
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		    	arr[i]=inp.nextInt();
		    }
		    //#2 Your code here
		    
		    for(int i=0; i<arr.length; i++) {
		    	
		    	  isPos(arr[i]);
		    }

		 
		  }
		  
		  public static void isPos(int num)
		  {
			  String result ="";
			 
		    if(num>0) {
		    	result = "positive";
		    }if(num<=0) {
		    	result = "not positive";
		    }
		   System.out.println(result);
		  }
		  
	}


