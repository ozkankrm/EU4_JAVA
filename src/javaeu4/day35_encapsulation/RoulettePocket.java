package javaeu4.day35_encapsulation;

public class RoulettePocket {
	
	private int number;
	
	
	public RoulettePocket(int number) {
		this.number = number;

	}
	public int getPocketnNumber() {
		return number;
	}
	public void setPocketNumber(int number){

		if(number<0 || number>36) {
			this.number = 999;
		}else {
			this.number = number;
		}
	}
	
	public String getPocketColor() {
		
		if(number==0 ) {
			return "Green";
		}else if(number>0 && number<11) {
			if(number%2==0) {
				return "Black";
			}else {
				return "Green";
			}
		}else if(number>10 && number<19) {
			if(number%2==0) {
				return "Red";
			}else {
				return "Black";
			}
		}else if(number>18 && number<29) {
			if(number%2==0) {
				return "Red";
			}else {
				return "Black";
			}
		}else if(number>28 && number<37) {
			if(number%2==0) {
				return "Red";
			}else {
				return "Black";
			}
		}else {
			return "invalid";
		}
		
	}
	
	
	
	

}
