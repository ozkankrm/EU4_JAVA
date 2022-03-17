package repl.rep.it4;

import java.util.Scanner;

public class Methods7_Plus_Minus {

	public static void main(String[] args) {
		
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);
		  }//end main
		  
		  public static void plus_minus(int[] arr){
		    int count =0;
		    int count1=0;
		    int count2 =0;
		   
		    for(int i=0; i<arr.length; i++) {
		    
		    if(arr[i]==0){
		      count++;
		    }
		    if(arr[i]>0){
		      count1++;
		    }
		    if(arr[i]<0){
		      count2++;
		    }
		    
		  }
		    
		    System.out.println("positive:s" +count1+ ", " + "negatives:" +count2+ ", " +"zeros: " + count);
		  
		  }
	

}
