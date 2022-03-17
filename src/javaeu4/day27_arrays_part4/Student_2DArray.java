package javaeu4.day27_arrays_part4;

public class Student_2DArray {

	public static void main(String[] args) {
		
		int[][] students = {
				{4,5,6},
				{12,5,7},
				{23,56,12,55,3}
					};

		for(int[] group : students) {
			for(int studentID : group) {
				System.out.println(studentID);
			}
		}
		
		
		
		
	}

}
