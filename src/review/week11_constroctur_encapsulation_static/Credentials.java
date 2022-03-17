package review.week11_constroctur_encapsulation_static;

public class Credentials {

	/*
	public String userName = "A123456789";
	public String passWord = "Cybertek";
	*/
	
	private String userName = "A123456789";
	private String passWord = "Cybertek";
	
	/*
	public static String userName() {// static method not reach instance variabl
		
	}
	*/
	
	// getuserName-->getvariableName
	public String getUserName() {
		return userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;//this. used it to call the instance when local variable is sharing
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
