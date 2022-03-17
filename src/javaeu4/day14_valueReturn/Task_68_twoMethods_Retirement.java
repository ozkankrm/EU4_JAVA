package javaeu4.day14_valueReturn;

public class Task_68_twoMethods_Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write two methods:
//	1-calculateAge(yearBirth); and returns the age
//	2-yearsUntilRetirement(name,year); and displays in the console following: �Mike retires
//	in 36 years�
//	Example: yearsUntilRetirement(�Mike�,1990);
	
		
		
		
		yearsUntilRetirement("Mike", 1975);
	
	}

	public static void yearsUntilRetirement(String name, int year) {
		
		// retirement age = 65 - age;
		int retirementAge = 65-calculateAge(year);// return metodu sabit methodun i�inde kullnad�k
		
		System.out.println(name + " retires in " + retirementAge  + " years");
		
	}

	public static int calculateAge(int yearBirth) {
		
		
		
		return 2020-yearBirth;
	}

}
