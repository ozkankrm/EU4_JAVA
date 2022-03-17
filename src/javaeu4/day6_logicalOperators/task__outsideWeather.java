package javaeu4.day6_logicalOperators;

public class task__outsideWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree = 70;
		boolean comp = (!(OutsideWeather=="Rainny"||Degree==70));	
		//!(F||T)-->!(T)-->F // Burda ! parantez d���nda oldu�una dikkat et
		System.out.println(comp);

	}

}
