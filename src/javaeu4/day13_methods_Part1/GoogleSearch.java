package javaeu4.day13_methods_Part1;

public class GoogleSearch {

	public static void main(String[] args) {
		// Test Case

		
		navigateGoogle();
		searchShoes();
		printResult();
	}
	public static void navigateGoogle() {
		System.out.println("launch chrome browser");
		System.out.println("navigate to google.com");
	}
	public static void searchShoes() {
		System.out.println("type shoes into search field");
		System.out.println("click on search button");
	}
	public static void printResult() {
		System.out.println("result for shoes");
	}

}
