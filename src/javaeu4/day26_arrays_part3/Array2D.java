package javaeu4.day26_arrays_part3;

public class Array2D {

	public static void main(String[] args) {
		
		//new den sonraki ilk [] i�ine yazmak zorunlu
 		double [][] scores= new double[3][4]; // 3 array var ve her birinin size 4 ve her biri 4 elemetn i�erir.
 		
 		System.out.println(scores);// adress g�r��yor
 		
 		System.out.println(scores[0]);/// adress
 		
 		System.out.println(scores[0][0]);
 		System.out.println(scores[0][1]);
 		System.out.println(scores[0][2]);
 		System.out.println(scores[0][3]);
		
 		System.out.println(scores[1][0]);
 		System.out.println(scores[1][1]);
 		System.out.println(scores[1][2]);
 		System.out.println(scores[1][3]);
 		
 		System.out.println(scores[2][0]);
 		System.out.println(scores[2][1]);
 		System.out.println(scores[2][2]);
 		System.out.println(scores[2][3]);
 		
 		System.out.println("-------------------------");
// 		we re-assign
 		scores[0][1]=10;
 		System.out.println(scores[0][1]);
 		
 		
 		
 		
	}
}
