package assignments.Assessment_4;

public class Question_16 {

	public static void main(String[] args) {
		
		String str = "Cybertek Student";
		int x = str.indexOf("t", 8); // 8 den sonraki gelen t yin indexine bak demek
		System.out.println(x);
		
		System.out.println(str.substring(3, x));

	}

}
