package review.week9_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringStars {

	public static void main(String[] args) {
		
		String[] str = {"one", "hi", "hold"};
		
		ArrayList<String> s = new ArrayList<>();
		s.addAll(Arrays.asList(str));
		System.out.println(s);
		
		ArrayList<String> s2 = new ArrayList<>(Arrays.asList(str));
		System.out.println(s);
		
		System.out.println(makeStars(s));
		
	}
	public static ArrayList<String> makeStars(ArrayList<String> words){
		
		ArrayList<String> stars = new ArrayList<>();
		
		for(String wrd : words) {
			
			String eachStar = "";
			
			for(int i=0; i<wrd.length(); i++) {
				
				eachStar += "*";
			}
			
			stars.add(eachStar);
			
		}
		return stars;
	}
	

}
