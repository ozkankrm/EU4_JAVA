package javaeu4.day44_oop_practice.callcentre;

public class Whatsapp extends MessagingApp implements VoiceCallable, VideoCallable{

	@Override
	public void videoCall() {
		System.out.println("Whatsapp - doing a video call Mr. Mike..");
		
	}

	@Override
	public void call(String contact) {
		System.out.println("Whatsapp - calling " + contact+ "..." );
		
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whatsapp - sending a message - " + msg + "...");
		
	}

}
