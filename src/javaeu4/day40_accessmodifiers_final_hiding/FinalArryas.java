package javaeu4.day40_accessmodifiers_final_hiding;

public class FinalArryas {

	public static void main(String[] args) {


		final int[] TEAMS = {11,11};
		System.out.println(TEAMS[0]);
		TEAMS[0] = 15;
		System.out.println(TEAMS[0]);
		
		int nums[] = new int[] {20,20,40};
		
		nums = new int[] {10,15,100};
		
		final int[] finalNums = {23,66,44};
		
		finalNums[0] = 120;//burda arrayin elementleirnde değişiklik yapabiliyoruz
//		finalNums = new int[] {1,2,3,4};//burda arrayin adresini değiştiremeyiz. hata verir.
		
		final int A=5;
		final int B=4;
		final int[] XXX = {A,B};
		
		XXX[0] = 10;

	}

}
