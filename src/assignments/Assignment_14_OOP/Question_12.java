package assignments.Assignment_14_OOP;

public class Question_12 {

	public static void main(String[] args) {

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
