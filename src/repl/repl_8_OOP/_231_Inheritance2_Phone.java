package repl.repl_8_OOP;

public class _231_Inheritance2_Phone {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
	CameraPhone cp = new CameraPhone(8,8);
	

	}

}

class Phone{
	
	int imageSize;
	int memorySize;
	
	public Phone(int imageSize, int memorySize) {
	
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	} 
	
	public int numPictures() {
		return memorySize*1000/imageSize;
	}
	 
}

class CameraPhone extends Phone{

	public CameraPhone(int imageSize, int memorySize) {
		super(imageSize, memorySize);
		
	}

	
	
	  
}