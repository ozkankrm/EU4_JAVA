package review.week4;

public class LoopControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		break: breaking out of the loop early
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			
			if(i==5) {
				System.out.println("I am gonna break right heere!!");
				break; // 5 ten sonra�n� yazd�rmaz ve ��kar
			}
		}
		System.out.println();
		
//		continue: skip the current iteration
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			
			if(i==5) {
				System.out.print("I will just skip this one!!");
				continue; // 5 i atlar ve 6 dan yazmaya devam eder
			}
		}
		
		System.out.println();
		
		for (int i = 1; i <=10; i++) {
			
			if(i!=5) {
				System.out.print(i + " ");
				
			}else {
				System.out.println("I will just skip this one!!! ");
			}
		}
	}

}
