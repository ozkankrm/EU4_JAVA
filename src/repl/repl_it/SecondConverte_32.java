package repl.repl_it;

import java.util.Scanner;

public class SecondConverte_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    
	    int inputSeconds, hours, minutes, seconds;
	    System.out.println("Enter seconds:");
	    
	    inputSeconds = scan.nextInt();
	    
	    hours = inputSeconds / 3600;   // hours = 
	    								// remainingSecondAfterHour = inputSeconds % 3600;
	    minutes = (inputSeconds/60)%60; // minutes = remainingSecondAfterHour / 60
	    seconds = inputSeconds%60;      // seconds = remainingSecondAfterHour % 60
	    
	    System.out.println(hours + " hours, " +minutes+ " minutes, " + "and " + seconds+ " seconds");
	    
	    int girilenSaniye = 3695;
	    int saat = girilenSaniye/3600;
	    int saattenSonraKalanSaniye = girilenSaniye % 3600;
	    int dakika = saattenSonraKalanSaniye / 60;
	    int saniye = saattenSonraKalanSaniye % 60;

	    
	}

}
