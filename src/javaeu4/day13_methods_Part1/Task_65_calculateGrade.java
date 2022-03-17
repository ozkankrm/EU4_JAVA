package javaeu4.day13_methods_Part1;

public class Task_65_calculateGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		90-100----A
//		80-89-----B
//		70-79 ----C
//		60-69----D
//		0-59-----F
		
		calculateGrade(100,100,100);
		
	}

	public static void calculateGrade(int num1, int num2, int num3) {
		
		char grade  = 'W';
		 int average = (num1+num2+num3)/3;
		if(average>=90 && average<=100) {
			
			grade = 'A';
		}else if(average>=80 && average<=89) {
			grade = 'B';
		}else if(average>=70 && average<=79) {
			grade='C';
		}else if(average>=60 && average<=69) {
			grade = 'D';
		}else if(average>=0 && average<=59) {
			grade = 'F';
		}else {
			
		}
		System.out.println(grade);
	}

}
