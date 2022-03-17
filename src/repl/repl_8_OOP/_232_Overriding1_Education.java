package repl.repl_8_OOP;

public class _232_Overriding1_Education {

	public static void main(String[] args) {
		
		LawSchool lws = new LawSchool();
		System.out.println(lws.graduationRequirements());
		
		

	}

}

class EducationalInstitution{
	  private int years;

	public EducationalInstitution(int years) {
	
		this.years = years;
	}
	  
	  public String graduationRequirements() {
		  return years +  " years of study"; 
	  }
	}

class LawSchool extends EducationalInstitution{

	public LawSchool() {
		super(3);
		// TODO Auto-generated constructor stub
	}
	
	public String graduationRequirements() {
		super.graduationRequirements();
		return  "3 years of study and passing the bar";
	}
	
	
	
	
	
	
	
}






