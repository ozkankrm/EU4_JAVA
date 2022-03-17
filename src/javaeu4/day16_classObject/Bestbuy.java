package javaeu4.day16_classObject;

public class Bestbuy {

	public static void main(String[] args) {
		
		CellPhone cell1 = new CellPhone();
		
		System.out.println(cell1.brand); //null
		System.out.println(cell1.color);//null
		
		cell1.brand = "Samsung";//cell1.brand == variable name g�revi g�r�r.
		cell1.color = "Gold";
		cell1.price = 1950;
		cell1.screensize= 1.9;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.price);
		System.out.println(cell1.color);
		System.out.println(cell1.screensize);
		
		cell1.color = "Black"; //burda reassign yapt�k ve color yenide�eri-->Black
		System.out.println(cell1.color);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand ="Siemens";
		cell2.screensize = 1.7;
		cell2.color = "Red";
		cell2.price = 50.5;
		
		System.out.println("$$$$CELL 2 VALUES####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("ScreenSize: " + cell2.screensize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Price: " + cell2.price);
		
		System.out.println("####CALL��NG METHOD#####");
		cell1.call();
		cell1.message();
		cell1.takeAphoto();
		System.out.println("###############");
		cell2.call(); //cell2 calling method
		cell2.message();
		cell2.takeAphoto();

	}

}
