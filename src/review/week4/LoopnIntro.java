package review.week4;

public class LoopnIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x=1;
//		
//		if(x>0) {
//			System.out.println("do something here"); // infinite
//		ko�ul her zaman do�ru ve sonsuza gidiyor
//		}
		
//		count from 0 to 10 in 3 type of loops we learned
		int x=0;
		
		while(x<=10) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println();

//		do while loop
		int y=0;
		do {
			System.out.print(y + " ");
			y++;
		}while(y<=10);
		
		System.out.println();
		
//		k++ here get executed after each iteration
//		i�i yazd�rd�ktan sonra sonlan�r
		for(int k=0; k<=10; k++) {
			System.out.print(k + " ");
		}
		
	}
	

}
