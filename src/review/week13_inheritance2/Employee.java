package review.week13_inheritance2;

public class Employee extends Person{ //Employee IS A Person
	
	public static double hourlyRate;
	public String jobTitle, ID;
	public boolean isFullTime;
	
	public Employee(String name, int age, char gender, String ID, String jobTitle, double hourlyRate, boolean isFullTime) {
		super(name, age, gender);
		this.ID = ID;
		this.jobTitle = jobTitle;
		this.hourlyRate = hourlyRate;
		this.isFullTime = isFullTime;
		
	}

	public void work() {
		System.out.println(jobTitle + " " + name + " is working");
	}
	
	public double calculateSalary() {// 40 hours in a week, 52 weeks in ayear
		
		
		if(isFullTime) {
		return hourlyRate*40*52; //40 hour a week--> full time
		
		}else {
			return hourlyRate*20*52;// 20 hour a week --> part time
		}
	}

	@Override
	public String toString() {
		return 
				super.toString() + //persondaki toStringi buraya call ettik
				"Employee [name = " + name + ", gender= " + gender + ", age= " + age + "hourlyRate=" + hourlyRate + ", jobTitle=" + jobTitle + ", ID=" + ID + ", isFullTime="
				+ isFullTime + ", Salary= $"+calculateSalary()+ "]";
	}

}
/*
 * 	Employee extedns Person:
		attributes: name, age, gender, hourlyRate, jobTitle, ID, isFullTime
 */
