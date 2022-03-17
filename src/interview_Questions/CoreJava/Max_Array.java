package interview_Questions.CoreJava;

public class Max_Array {

	public static void main(String[] args) {
				 //0 1 2 3 4 5 6	
		int[] a = {25,5,1,7,3,9,0,24,50};
	
			System.out.println(maxArr(a));
			
			
			int max = a[0];
			
			for(int herbirSayı : a) {
				
				if(herbirSayı>max) {
					
					max = herbirSayı;
				}
			}
			
			

	}
	
	public static int maxArray(int[] arr) {
		
		int max = arr[0]; //arrayin ilk değerinin max olduğunu varsayıyoruz
		
		for(int each : arr ) {
			
			if(each>max) {
				
				max = each;
			}
		}
		
		return max;
	}
	
public static int maxArr(int[] arr) {
		
		int max = arr[0]; //arrayin ilk değerinin max olduğunu varsayıyoruz
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		return max;
	}

}
