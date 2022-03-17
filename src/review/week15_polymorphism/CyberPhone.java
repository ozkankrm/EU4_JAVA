package review.week15_polymorphism;

public class CyberPhone extends Phone implements AndroidApp, AppleApp{

	public CyberPhone(String brand, String model, double price, double size) {
		super("CyberPhone", "", 0, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void download() {
		System.out.println("Dowloading " + AndroidApp.AppName);
		System.out.println("Dowloading " + AndroidApp.AppName);
		
	}

	@Override
	public void texting(long phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calling(long phoneNumber) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
