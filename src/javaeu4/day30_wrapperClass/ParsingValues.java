package javaeu4.day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parseInt(strin);
		
		String str = "2018";
		System.out.println(str);// 2018;

		int number = Integer.parseInt(str);
		System.out.println(number);// 2018

		str +=1; // 20181-->concat
		System.out.println(str);

		// str burda int e d�n��t� ve art�k int olarak i�lem g�r��yor
		number +=1; // 2019 --> aritmetic operation
		System.out.println(number);

		// str string primiy-tive doubla d�n��t�

		double d = Double.parseDouble(str);//�nce wrapper class Ad�.parseDataType
		System.out.println(d);// 20181.0
		
		
		int i = 10;
		String s = String.valueOf(i); // valueOf(integer) methodu integer bir de�eri stringe convert eder
		System.out.println(i);// it will return "10"
		
		String s2 = Integer.toString(i);
		System.out.println(s2);// it will return "10"
	}

}
