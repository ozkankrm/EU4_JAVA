package review.week5_methodPractice;

public class MethodCallingInsideAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	wakeUp();
		 * 
		 * prepareTheKids();
		 * 		makeBreakfast();
		 * 		feedTheKids();
				dropTheKidsToSchool();
		 *
		 *
		 *workAndLearn();
		 *		work();
		 *		attendClass();
		 */
		
		wakeUp();
		
		prepareTheKids();
	}
	
	public static void wakeUp() {
		
		System.out.println("open one eye");
		System.out.println("close it an back to sleep");
		System.out.println("throw the alarm and wake up and drink coffee");

		}
	
	public static void prepareTheKids() {
		System.out.println("prepare the kids start");
		makeBreakfast();
		feedTheKids();
		dropTheKidsToSchool();
		System.out.println("prepare the kids method end");
	}
	
//	makeBrekfast();
	public static void makeBreakfast() {
		System.out.println("make turkish tea or coffee");
	}
	
	//feedKids
	public static void feedTheKids() {
		System.out.println("feed the kids ");
		
	}
	
	//drop kids to school
	public static void dropTheKidsToSchool() {
		System.out.println("drop the kids to school");
	}

}
