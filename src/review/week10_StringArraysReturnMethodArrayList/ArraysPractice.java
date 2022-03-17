package review.week10_StringArraysReturnMethodArrayList;

public class ArraysPractice {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=0; i<=arr.length-1; i++) {
			
			if(arr[i]%2==0) {
				countEven++;
				 
			}else {
				countOdd++;
			}
		}
		System.out.println("Even Numbers: " + countEven);
		System.out.println("Odd Numbers: " + countOdd);
		
		System.out.println("================================================================");
		//M�N VE MAX TA interviewde sort KULLANMA. A�a��daki y�ntemi kullan
		int[] numbers = {10,20,30,5,4,3,2,1,40,50};
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		
		for(int each : numbers) {
			
//			max = Math.max(each, max);
			
			if(each>max) {
				max = each;	
			}
			
//			min = Math.min(each, min);
			
			if(each<min) {
				min = each;
			}
			
			sum += each;
		}
		double average = sum / numbers.length;
		
		System.out.println(" Max Number: " + max);
		System.out.println("Min Number: " + min);
		System.out.println("Average Number: " + average);
	}

}
