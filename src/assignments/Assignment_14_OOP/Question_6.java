package assignments.Assignment_14_OOP;

public class Question_6 {

	public static void main(String[] args) {

		ParkingMeter pm = new ParkingMeter(2);
		System.out.println(pm.add(4));
		pm.isExpired();
		pm.maxTime = 15;
		pm.timeLeft = 3;
		pm.isExpired();
		pm.tick();
		

	}

}

class ParkingMeter{
	  int timeLeft = 0;
	  int maxTime;
		
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
		
	public boolean add(int a) {
		
		if (a == 25) {
			if (timeLeft < maxTime) {
				timeLeft += 30;
				return true;
			}
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