package javaeu4.day24_arrays_Part1;

public class SUMMARY_ARRAY {

	public static void main(String[] args) {
		
		int[] scores; // declare an int array
		scores = new int[4]; // instantiate an int array of 4 elements
						
		scores[0] = 85;// assigns to 1st element
		scores[1] = 90;// assigns to 2nd element
		scores[2] = 75;// assigns to 3rd element
		scores[3] = 60;// assigns to 4th element
		
		System.out.println(scores[0]); // print 1st array element
		System.out.println(scores[1]); // print 2nd array element
		System.out.println(scores[2]); // print 3rd array element
		System.out.println(scores[3]); // print 4th array element
		
		int avgScores = (scores[0]+scores[1]+scores[2]+scores[3])/4;
		System.out.println(avgScores);

	}

}
