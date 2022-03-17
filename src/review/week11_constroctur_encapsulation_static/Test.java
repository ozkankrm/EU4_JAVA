package review.week11_constroctur_encapsulation_static;

public class Test {
	
	public int score;
	
	public Test(int score) {
		this.score = score;
	}

}

class B{
	//every class have constructor
	
	
	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		
		System.out.println(t1.score);
	}
}
