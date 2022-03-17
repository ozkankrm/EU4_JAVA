package review.week8_Arrays;

public class UniqueFromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,1,4,2,3,6,6,8,7,9,5,5,4,};
		
		uniquesValues(x);
		
	}
	
	public static void uniquesValues(int[] nums) {

		for(int eachNum : nums) {
			
			int count = 0;
			for(int eachInnerNum : nums) {
				
				if(eachNum == eachInnerNum) {
					count++;
				}
			}
			if(count ==1) {
				System.out.println(eachNum);
			}
		}
		
}
}