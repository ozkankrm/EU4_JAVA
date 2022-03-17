package assignments.Assignment_14_OOP;

public class Question_8 {

	public static void main(String[] args) {
		
		Value vl = new Value(5);
		
		System.out.println(vl.getVal());
		vl.setVal(10);
		
		System.out.println(vl.getVal());
		
		Value vl1 = new Value();
		System.out.println(vl1.getVal());
		
		System.out.println(vl.wasModified());
	}

}
class Value{
	
	private int val;

	public Value() {
		
	}

	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	public boolean wasModified() {
		
		if(val!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
