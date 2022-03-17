package assignments.Assessment_4;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = "rumble";
		
		b += b.concat("4").substring(3, b.length()-1);// burdaki b ba�taki 
//		b.concat("4")// rumble4
//		b.substring(3, 5) // bl
//		rumble + bl=rumblebl
		
		System.out.println(b);
	}

}
