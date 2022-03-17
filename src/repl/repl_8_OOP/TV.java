package repl.repl_8_OOP;

public class TV {
	
	int channel=1;
	int volumeLevel=1;
	boolean on = false; 
	String brand = "undefined" ;
	
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand = brand;
	System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		
		if(channel>0 && channel<121) {
			this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
	
		if(on=true) {
			
			if(volumeLevel>0 && volumeLevel<8) {
				this.volumeLevel = volumeLevel;
			}
		}else {
			System.out.println( "ERROR: TV is either OFF or invalid Volume level");
		}
		
		
	}

	public String getBrand() {
		return brand;
	}
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
	public boolean On() {
		return on;
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
		
		if(on==true) {
			System.out.println("TV is already ON");
		}else {
			on=false;
		}
		return on;
	}
	public boolean turnOff() {
		
		if(on) {
			System.out.println("TV is already OFF");
		}else {
			on=true;
		}
		return on;
		
	}

}
