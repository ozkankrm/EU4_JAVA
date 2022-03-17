package javaeu4.day36_staticClassMembers;

public class ABC_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC.m1();//call method thru only static way
		ABC.m2();
		
	/*	//classta private constructor olu�turduk ve buras� hata verdi
		ABC abc = new ABC();//we want error
		
		abc.m1();
		
		whenever all of your methods in your class are static, and you want 
		everyone to call them static way(ClassName.methodName)
		then you can simply make your constructor private
	*/
		
		
		
	}
	
	public static void print() {
//		static int a=5;//local variables
		//local variables cannot be static
	}

}
