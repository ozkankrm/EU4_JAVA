package javaeu4.bootcamp.day2;

public class Day2_Notes {
}
/*
Java bootcamp

1. Primitives


Primitive type casting: Implicit vs Explicit
	byte < short < int < long < float < double
	char ,  boolean

	2 type casting primive and referance casting(object)

	primitce type casting
		implicit-->from smaller to larger type
		explicit-->from larger to smaller type

3. Wrapper Class
	-the objects that represents the primitives

	-start upper case
	Byte, Short , Integer, Long, Float, Double, Character, Boolean

	auo boxing
	auto unboxing

3. String
	char sequences
	"eu4"
	013->3 char // start zero (0)
	representin squence of char
	class and without object

	string manipulation

	methods: charAt, length, substring, lower case, upper case, replace, equals, contains, startsWith,endWiths, split, toCharArray

4. Char Sequences
	1. String 		: immutable object, 		unchanchable
		bu neden daha çok kullanılıyor. hızlı,
	2. StringBuilder : mutable, not Synchroniozed
	3. StringBuffer	 :mutable, Synchroniozed=>slowerr
		mutable: dont change string just modifiye string

	Synchroniozed: thread-safe==> one thread 				at a time
	thread: sub sequence of a process

	multi-threads: multi treads are being executed

6. Loops: repeated actions
		for repeat, iteration

		for:
		//condition false olana kada repead

		//useing increment(+) and decriment(-)
			for(initialization; condition;){

			}

		while:
		//condition false olana kada repead yapar

			while(condition){

			}

			automate de db de kullandık
				while(rsltset.next())

7. Array:
		-one of data structures (array, collection, map)
		-fixed size

8. for each loop:must be applied to data string
			 iteration order is fixed(from beginnig to end)

			 for( Variable : Data Structure )
	index yok

9. Custom method:
			function, grouping series of codes reusable

10. Method overloading.
			multiple methods having same method name
			parameter must be different
			method name must be same

11. Constructor: special method. used for 					creating an object from class
			execution ALWAYS depends on objwct

			declare:

				AccessModifier ClassName(parameter){
					statements;

				}

				creating object:
					new ConstructorOfClass


12. Class and Object:
		class is blueprint of object
		object is coming from the class, real

		object cannot be exist without class


static belongs to class

only one


13. instance vs static
	static: only one copy (class)
	istance: multiple copies (object)

14. class imports;
		import Package.ClassName;//for importing one class from the package
		import Package.*;//for importing all the class from the package

	static import:
		import static Package.ClassName.staticMember;//import static membr of the class
		import static Package.ClassName.*;

15. Access Modifier
	least visible to much visible
	private default protected public

	private:
	default:
	protected:
	public:

16. OOP Encapsulation

17. OOP Inheritance
		super and sub relationships between classes

		sub class: inherits visible variables and methods from super class

		super class: does not inherit any extendss

		Class A extends B
		A-->sub
		B-->super

		InterfaceA extends interfaceB,interfaceC.....

		class implements InterfaceA interfaceB,interfaceC

	Advantage this consept:
		improve reusuability
		easy to maintain
		less codes no duplication
		clean
		easy understandable
		readibility


	Car:
		Mercedes
			price, model, year, color...
			start(), driver()....
		Toyota
			price, model, year, color...
			start(), driver()....
		Audi
			price, model, year, color...
			start(), driver()....
		BMW
			price, model, year, color...
			start(), driver()....


	Car:
			price, model, year, color...
			start(), driver()....
		Mercedes extends Car

		Toyota extends Car

		Audi extends Car

		BMW	extends Car

	Testing
		TestBase
			WebDriver driver = new ChromeDriver();
			setUp();==>@BeforeMethod
			tearDown();==>@AfterMethod

		Amazon extends TestBase

		Google extends TestBase

		Etsy extends TestBase

	Page Package
		BasePage
			public BasePage(){
				PageFactory.initElements(driver, this);//initialize the page
			}

			@FindBy(xpath = "")=>driver.findElement

		HomePage extends BasePage

		CheckOutPage extends BasePage

		LoginPage extends BasePage

Interitence allows changing one place

		why we need?
			Reusing already created methods and variable

If wedo not extend basepage class we need to do it , or we need to create PageFactory.initElements(driver,this); containing constructor manually.


18. Is A vs Has A:

	BMW extends Car ==> BMW is A Car


19. Method Overriding
		giving different implementations to ONE method.
		cannot be static, privatei final

		ONLY happens in sub class

	WebDriver drive = new ChromeDriver();
			driver.get("url");
	WebDriver drive = new FireFoxDriver();
	WebDriver drive = new EdgeDriver();

	WebDriver==> interface

		same name same parameters--overriding

	toString()==> from Object class
				bununla override methodları yazdırırz

20. final keyword: constant. unchangable

	variable: cannot be reassigned

	method: cannot be overriden

	class: cannot be extends

21. OOP abstraction
		abstract method: method without body				body nin olmaması 					orda statamenet 					olmaycağı anlamına 					gelir
				sub (concrete() classta abstrack methodu implement etmek zorundasın

				meant to overridden

	2 ways of achieving abstraction:
			1. abstract class: meant to be 			inherited ( cannot be 			final)
					cannot create object from abstract class

			2. interface:meant to be 				implemented. cannot be 			final
					not a class
					there is only one access modifier that can be used: public

				methods: abstract, static, default
				variables: public static final by default

				allows us to achieve multi-inheritance

	abstract class: BasePage, TestBase...
	interface that ı have used: WebElement, WebDriver, Map, Set




	Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best suited for providing a common functionality to unrelated classes.

22. Polymorphism: objects taking on different forms. IS A relationship is mandatory
SuperType being referenced to subType
(objects takes different forms)



Exception: something went wrong,unexpected events

	unchecked exceptions: Occurs during runtime

	checked exception: Occurs during compile time (Must be handle right away)

	exception handling:
		1. try & catch: handles any exceptions permanently

		2. throws: only handling check excepitons, temprarly solutions

when you write code, you run it, get the error, read it then create your exception that is handling code.


26. final finally finalize
	final: key word
	finally: block
	finalize(): method, garbage collector calls it before destroying the object

27. garbage collection: a place where all 		the unreferenced objects goes to
	ONLY unreferenced objects are eligible for garbage collection



29. Collection: one of the data structure
				size is dynamic
				only supports non-primitives

		List: accepst duplicates, has index

			ArrayList: internally uses array, retrieveing the data is faster

			LinkedList:doublly linked. adding

			Vector:

			Stack:

		Set: does not have index, does not 		accept duplicates

		Queue:accept duplicates, does not 		have index. FIFO

30. Map: one of the data structures. pairs 			of data


 */
