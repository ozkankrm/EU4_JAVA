package repl.task_variable;

public class task_1_castOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pies=10, people =4;
		double piesPerson;
		
	piesPerson = pies/people; // double tan�mlanmad���ndan ve int/int=int olur
	System.out.println(piesPerson);// 2
	
	
	int a = 10, b=4;
	double c;
	c=a/b;
	System.out.println(c);
	
	c=(double)a/b; // double tan�mland���ndan sonu� double olur
	System.out.println(c); // 2.5
	
	c=a/(double)b; // double tan�mland���ndan sonu� double olur
	System.out.println(c); // 2.5
	
	
	int x=15, y =2;
	double t = 7.8;
	int f;
	f = (int)(t +(double)(15)/2);
	System.out.println(f);

 System.out.println(3 - 5 % 7);

	
	
	
	}

}








