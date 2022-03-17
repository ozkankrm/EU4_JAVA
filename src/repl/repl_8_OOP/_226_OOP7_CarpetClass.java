package repl.repl_8_OOP;

public class _226_OOP7_CarpetClass {

	public static void main(String[] args) {
		
		 Carpet c  = new Carpet();
		    System.out.println(c.totalPrice);

		 Carpet c2 = new Carpet(20, 20, 2, false);
		 System.out.println(c2.totalPrice);
	}

}
class Carpet{
	
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	
	  public Carpet() {
		this.totalPrice = 200;
		this.length = 300;
		this.width = 300;
		this.isPersian = false;
		this.unitPrice = 0;	
	}
	  
	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
	
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
		
		this.totalPrice = (width+length)*unitPrice;
		
		if(isPersian==true) {
			this.totalPrice += 200;
		}
		
	}
	  
	 
	
	
	
	
}
