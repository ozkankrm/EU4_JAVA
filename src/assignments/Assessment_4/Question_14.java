package assignments.Assessment_4;

public class Question_14 {

	public static void main(String[] args) {
		
		int x1 = getLoad();
		int d = getLoad(x1, "Cybertek");
		
		System.out.println(x1+d); // 12
		
	}
	
	public static int getLoad() {
		return 3;
		
	}
	public static int getLoad(int x1, String x2) {
		return x1+x2.length()-2;
	}
	public static int getLoad(String str) {
		return 4;
	}

}
