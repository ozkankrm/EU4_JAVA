package assignments.day5_assignment_3_aritmetikOperators;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputSeconds =25000000;
		int hours, minutes, seconds;
		
		minutes = (inputSeconds / 60) % 60;
		hours = inputSeconds/3600; // 1 hour =3600 seconds
	//	hours = hours % 24;
		seconds = inputSeconds % 60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, " + " seconds " + seconds );
	}

}
