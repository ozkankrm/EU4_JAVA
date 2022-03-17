package review.week15_polymorphism;

public class PhoneObjects {

	public static void main(String[] args) {
		
		iPhone phone1 = new iPhone("11", 1999, 8.0);

		Phone phone2 = new iPhone("8", 1000, 6.5);
		Object phone3 = new iPhone("5", 500, 5);
		AppleApp phone4 = new iPhone("7", 1500, 7.0);
		
		phone1.faceTiming(1235666767);
	//	phone2.faceTiming(99998779);//faceTiming Phone da yok ve override olmadı bunu run etmez ama sub clasta var ve cast gerekir
		((iPhone) phone2).faceTiming(99998779);//burda cast yaptık ve run oldu
		System.out.println(phone1.model);
		
		((iPhone) phone4).faceTiming(1948292833);
		
		phone1.download();
		((iPhone) phone2).download();//casting
		
		((AppleApp) phone2).download();
		
		phone4.download();
		
		phone1.calling(123456789);
		
		phone2.calling(98754642);
		((Phone)phone3).calling(124987654);//up casting
		((iPhone)phone3).calling(124987654);
		
		((Phone) phone4).calling(11111111);//up casting
		
		((Phone) phone1).calling(2222222);// up casting //calling iPhone class
	}

}
