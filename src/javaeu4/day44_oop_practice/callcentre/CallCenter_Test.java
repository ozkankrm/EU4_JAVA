package javaeu4.day44_oop_practice.callcentre;

public class CallCenter_Test {

	public static void main(String[] args) {

		Whatsapp whatsapp = new Whatsapp();
		
		whatsapp.launch();
		whatsapp.allOSCompatible = true;
		whatsapp.isFree = true;
		whatsapp.name = "Whatsapp";
		whatsapp.call("Ozzy");
		whatsapp.sendMessage("Hello");
		whatsapp.videoCall();
		whatsapp.accept();
		
		VoiceCallable.decline();//decline methodu stati olduğu için içinde bulunduğu Interface ismi ile çağırdık
		System.out.println(VoiceCallable.CAN_CALL);
		
		whatsapp.getCount();
		whatsapp.setCount(4);
		
		System.out.println("================================");
		
		VoiceCallable obj = new Whatsapp();//polymorphism
		obj = new Whapsapp2();
	//	obj.launch();//parentta launch method olmadığı için run etmez
		
		((MessagingApp) obj).launch();//surcut objet casting
		
		//MessagingApp obj2 = (MessagingApp) obj;//object casting
		
		obj.call("Mr. Mustafa");//call method parentta, eğer child da override olmamışsa parentekini run eder
		((Whatsapp) obj).videoCall();//object casting
	}

}
