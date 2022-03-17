package javaeu4.day26_arrays_part3;

public class Task_93_HowManyWords {

	public static void main(String[] args) {
		/*
		 * Task-93
"As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a
burst of light that had ricocheted from his temple, and saw, with that quick smile with which we
greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van�a
dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of
boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of
those who were carrying this sky, these boughs, this gliding fa�ade."

		 */

		String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head "
				+ "because of "  
				+ "burst of light that had ricocheted from his temple,"
				+ "and saw, with that quick smile with which we greet a rainbow or a rose, "
				+ "a blindingly white parallelogram of sky being unloaded from the van a"  
				+ "dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear "
				+ "reflection of boughs sliding and swaying not arboreally, but with a human vacillation, "
				+ "produced by the nature of those who were carrying this sky, these boughs, this gliding"
				+ " fa�ade.";
	
		
//		�nce split ile space (" ") ten her word u array e �evirdik
//		sonra length ile ka� elemetn oldu�unu bulduk. 
//		her bir element bir word e kar��l�k gelir.
		String[] arr = str.split(" ");
		
		System.out.println(arr.length);
		
		for(String value : arr) { // her bir wordu yazd�rd�k
			System.out.println(value);
		}
		
		System.out.println("-----------------------------");
		System.out.println(arr[5]); //pharmacy // 5 inci elementin hangi word a kar��lk geldi�i
		

	}

}
