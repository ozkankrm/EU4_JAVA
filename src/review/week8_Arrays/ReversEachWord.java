package review.week8_Arrays;

public class ReversEachWord {

	public static void main(String[] args) {


		System.out.println(reverseEachWord("I love learning java"));
		System.out.println(reverseEachWord("Today is a nice day"));

	}
	public static String reverseEachWord(String str) {
		
		String[] words = str.split(" ");// �nce t�m kelimeleri birer array elementine �evirdik
		
		String reverse = "";
		
		for(String wrd  : words) {
			String reverseEach = "";
			for(int i=wrd.length()-1; i>=0; i--) {
				
				reverseEach += wrd.charAt(i);// her kelimeyi tersine �evirdik
			}
			reverse += reverseEach + " ";
		}
		return reverse.trim();// ba�ta veya sonda space olmas�n diye trim yapt�k
	}

}
