package assignments.day_2;

public class Question_1 {

	public static void main(String[] args) {
		System.out.println("I am ready to be a java pro:)");

		
		
		
int n=4;
		
		int m=n; //copy 'n'
		for(int i=1; i<=n;i++) {	//for each row of elements
			
			for(int x=1; x<i;x++) 	{
				System.out.print("  "); //for each element less, add spaces
			}                          
			for(int j=m; j>=1; j--) { 
				System.out.print(j + "   ");//print the column of elements
			}                            
			
			System.out.println();  //add an enter
			m--;     			   //decrement the number of rows without affecting 'n'
		}
	}
	
	

}
