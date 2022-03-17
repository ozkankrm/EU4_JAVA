package javaeu4.day42_interface;

public interface Electric {
	
	//field daki variabler public static final olmak zorunda. çünkü değiştirilemezler
	public static final int FIELD1 = 5;
	
	boolean HAS_BATTERIES = false; //public final static // biz koymazsak compiler bizim adımıza ekliyor
	
	
	
	public abstract void charge();
	
	void charge2(); // bu otomatik olarak public abstract olurak oluşturuluyor compiler tarafından
	
	public default void methodA() {
		
	}
	
	public static void methodB() {
		
	}

	void selfDrive();

}
