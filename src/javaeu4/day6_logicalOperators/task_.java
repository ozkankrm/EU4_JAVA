package javaeu4.day6_logicalOperators;

public class task_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 2;
		
	boolean res = ++b ==2 || --b ==2 && --b ==2;
	//in memory: 2-->3-->2-->1 //b nin de�eri s�rayla de�i�erek u�ruyor
	//res      : 3==2 || 2==2 && 1==2;--> F || T && F -->  F || F --> F
	System.out.println(res);
	
	System.out.println("**********************************************************");
	
	
	boolean x = true, z = true;
	int y = 20;
	x = (y!=10) || (z=false); // burda z de f assign olmu� z ye yani yukardaki true ile kar��la�t�rmyacaks�n
	// ayn� �ekilde x e de yeni de�er atanm�� ve yukardaji true ile kar��la�t�rmayacaks�n
	System.out.println(x);
	
	System.out.println("**********************************************************");
	
	
	
	}

}
