package javaeu4.day16_classObject;

public class DogObjects {

	public static void main(String[] args) {
//		yazd�rma i�lemini main method da yap�yoruz
//		yeni objeyi  urda olu�turuyoruz

//		yeni object olu�turduk
	 Dog dog1 = new Dog();
	 
	 Dog dog2 = new Dog(); // bu objeci olu�turduk ve atma yapmad�ysak 
//	 					default value al�r yani string null int 0 boolean false al�r
	 Dog dog3 = new Dog();
	 
//	 object ad�n� yaz ve (.) koyup �teki classtan olu�turulan propertiesleri �a��r�� ve de�er verilir
	 dog1.age = 10; // yeni atama yapt�k
	 dog1.breed = "Maltese";
	 dog1.color = "White";
	 dog1.name = "Rover";
	 
//	yazd�rma 
	 System.out.println(dog1.age); //printin i�ine koyarak yazd�r�r�z
	 System.out.println(dog1.breed);
	 System.out.println(dog1.color);
	 System.out.println(dog1.name);
	 
//	 class taki methodlar� �a��rd�k ve yazd�r�r
	 dog1.barking();
	 dog1.hungry();
	 dog1.sleeping();
	 
	 
	 
	 
	}

}
