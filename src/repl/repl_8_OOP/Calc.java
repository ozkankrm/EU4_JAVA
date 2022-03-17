package repl.repl_8_OOP;

public class Calc {
	
	private int x;
	private int y;
	private int result;
	
	public int getResult() {
		return this.result;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void plus() {
		result = x+y;
	}
	public void minus() {
	result = x-y;
	}

}
