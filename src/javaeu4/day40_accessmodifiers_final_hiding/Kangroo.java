package javaeu4.day40_accessmodifiers_final_hiding;

public class Kangroo extends Marsupial {
	
	@Override
	public boolean isBiped() {
		return true;
	}
	
	public void getKangrooDescription() {
		
		System.out.println("Kangroo hops on two legs: " + isBiped());
	}
	
}
