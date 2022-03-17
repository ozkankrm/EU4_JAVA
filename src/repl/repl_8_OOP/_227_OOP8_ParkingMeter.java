package repl.repl_8_OOP;

public class _227_OOP8_ParkingMeter {

	public static void main(String[] args) {
		
		ParkingMeter pmeter = new ParkingMeter(20);

		System.out.println(pmeter.add(20));
	}

}

class ParkingMeter{
	
	int timeLeft = 0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		
		this.maxTime = maxTime;
	}
	
	public boolean add(int a) {
	
		if(timeLeft<maxTime) {
			
			if(a==25) {
				
			timeLeft +=30;
			return true;
			
			}else {
			timeLeft = timeLeft;
		}
		}else {
			timeLeft = timeLeft;
			
		}
		return false;
	}
	
	public void tick() {
		
		if(timeLeft>0) {
		
			timeLeft --;
		}
	}
	
	public boolean isExpired() {
		
		if(timeLeft==0) {
			return true;
			
		}else {
		return false;	
		}
	}
	
}
