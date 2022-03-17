package assignments.Assignment_14_OOP;

public class Question_5 {

	public static void main(String[] args) {

		

	}

}

class TV{
	private int channel = 1;
	private int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";
	
	public TV() {
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		
		if (on && (channel > 0 && channel < 120)) {

			this.channel = channel;

		} else
			System.out.println("ERROR: TV is either OFF or invalid Channel");
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		
		if (on && (volumeLevel >= 1 && volumeLevel <= 7)) {

			this.volumeLevel = volumeLevel;

		} else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void volumeUp() {
		volumeLevel++;
	}
	public void volumeDown() {
		volumeLevel--;
	}
	public boolean isOn() {
		
		return on;
		
	}
	public boolean turnOn() {
		
		if (on) {
			System.out.println("TV is already ON");
		}else {
			on = true;
		}
		return on;
	}
	public boolean turnOff() {
		
		if (on) {
			System.out.println("TV is already OFF");
		}else {
			on = false;
		}
		return on;
		
	}
}