package javaeu4.day27_arrays_part4;


public class Task_95_AverageScore {

	public static void main(String[] args) {
		
		int[][] scores = {  {68,75,54,80} , {100,64,20,50} , {10,35,40,90}     };

		int sum =0;
		
			for(int j=0; j<scores[0].length; j++) {
				
				sum += scores[0][j];
			}
	
		System.out.println(sum);
		System.out.println(sum/scores[0].length);
		
		System.out.println("--------------------------------");
		
		int sum1=0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i][0];
		}
		System.out.println(sum1);
	}

}
