package javaeu4.day36_staticClassMembers;

public class Countable_Test {

	public static void main(String[] args) {


		int objectCount;
	
		/*
		 // e�er static yoksa olu�turulan her obje classtan gelir ve �nce 0 olur sonra count++ dan 1 artarak 1 olur.
		Countable obj1 = new Countable();//1
		Countable obj2 = new Countable();//1
		Countable obj3 = new Countable();//1
		
		objectCount = obj1.getInstanceCount();
		objectCount = obj2.getInstanceCount();
		
		System.out.println(objectCount);
		*/
		
		
		Countable obj4 = new Countable();
		Countable obj5 = new Countable();
		Countable obj6 = new Countable();
		
		//ba��na static koydu�umuz i�in e�i�ikler classta oluyor ve ilk 0 sonra count++ dan her seferinde 1 artar ve sonraki
		// objeye artm�� hali aktar�l�r.
		objectCount = obj4.getInstanceCount();//1
		objectCount = obj5.getInstanceCount();//2
		objectCount = obj6.getInstanceCount();//3
		
		System.out.println(objectCount);
		
		System.out.println(Countable.instanceCount);
		

	}

}
