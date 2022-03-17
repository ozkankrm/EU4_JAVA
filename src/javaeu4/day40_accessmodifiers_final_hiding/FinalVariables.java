package javaeu4.day40_accessmodifiers_final_hiding;

public class FinalVariables {

	// YOU HAVE TO initialize same statement, instance variable
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3MAXSPEED; // burda declare ettik. aşağıda constructorda assign ettik
	public final int MODEL_X_PASSENGERS;//init blockta assign ettik
	public static final String ADMIN_USERNAME;//static final variable // where this variable will be initialized?
											// static block	
	
	
	
	public FinalVariables(){
		MODEL_3MAXSPEED = 200;// constructorda assign ettik
//		ADMIN_USERNAME = "OZZY";
	}
	
	{
		//istance block only runs whenever create 
		MODEL_X_PASSENGERS = 7;// init blockt assign ettik
	}
	
	//static block bir kere run olur ve hepsinden önce run olur
	static {
		ADMIN_USERNAME = "MIKE";
	}
	
	public static void main(String[] args) {


		final int MAX_PERSSENGERS_COUNT = 5;
		final int SSN;
		SSN = 66;
//		SSN++; // You cannot do this//because final
		
		FinalVariables f = new FinalVariables();
		
		System.out.println(f.ROADSTER_MAX_RANGE);
		System.out.println(f.MODEL_3MAXSPEED);
		System.out.println(f.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME  );//static aynı package da olduğu için objesiz de çağırabiliriz

	}

}
