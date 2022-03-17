package interview_Questions.CoreJava;

public class Array_Max {

	public static void main(String[] args) {
		
		int[] array = {1,4,6,8,9,10,45,50};
		
		maxArray(array);
		
		System.out.println(maxArray(array));

	}

	public static int maxArray(int[] arr) {
		
		int max = arr[0];
		
		for(int each : arr) {
			
			if(each>max) {
				max = each;
			}
		}
		
		return max;
		
	}
}
