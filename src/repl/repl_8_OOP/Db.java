package repl.repl_8_OOP;

class Db {
	
	private String name;
	private int yint;
	
	public void insertData(String name, int yint) {
		this.name = name;
		this.yint =yint;
		
	}
	
	public String getData() {
		return this.name;
	}
	public int getYint() {
		return this.yint;
	}
	public void setData(String name) {
		this.name = name;
	}
	public void setYint(int yint) {
		this.yint = yint;
	}
		

	
	
	

}
