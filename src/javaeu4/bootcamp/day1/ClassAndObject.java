package javaeu4.bootcamp.day1;



class Person{
	
	public String name, gender;
	public static boolean isHuman = true;  //staic olunca tüm objelere olduğu gibi aktarılır ve hepsi aynı olur
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name+" "+gender;
	}
	
	
}


public class ClassAndObject {
	public static void main(String[] args) {
		Person person1 = new Person("Daniel", "Male"); //Daniel
		Person person2 = new Person("Conor", "Male"); //Conor
		Person person3 = new Person("John", "Female"); //John
	}
	

}

class Test{
	
	int a;
	static int b;
	
	public static void main(String[] args) {
		
		Test test1 = new Test();
		test1.b = 10;
		
		Test test2 = new Test();
		test2.b = 20;
		
		System.out.println(test1.b);//20
		System.out.println(test2.b);//20
//static variable son durumda hangi değere sahipse o değer tüm objelere aktaralır
//örnekte son durumda b 20 ye eşitlenmiş ve int b static olduğu için test.b dekide b de 20 dir
//çünkü static variable belongs to the class		
		
}



}