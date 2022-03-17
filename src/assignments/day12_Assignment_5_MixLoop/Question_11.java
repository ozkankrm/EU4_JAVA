package assignments.day12_Assignment_5_MixLoop;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Question-11:

			Print the following output using nested for loops.

			4       3       2      1

			     3       2      1

			         2       1

			              1	
	*/
		
	
        int a=4;
		
		int b=a; 
		
		for(int i=1; i<=a;i++) {	
			
			for(int x=1; x<i;x++){
				System.out.print("  "); 
			}                          
			for(int j=b; j>=1; j--) { 
				System.out.print(j + "   ");
			}                            
			
			System.out.println();  
			b--;     			   
		}
	
	}

}
