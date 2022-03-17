package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_3 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and checks the lengths of the arrays first. If lengths
are more than 1, it prints true if the arrays have the same first element or they have the
same last element. If the length of the array is not more than 1, it prints the "array1 is not
a valid array " or "array2 is not a valid array"
int[] x = {1,2,3}; = >true
int[] y = {7,3};
int[] x1 = {1,2,3}; = >false
int[] y1= {7,3,2};
int[] x2 = {1,2,3}; = > true
int[] y2= {1,3};
int[] x3 = {1}; = > Array1 is not valid
int[] y3= {7,3};
int[] x4 = {1,2,3}; = > Array2 is not valid
int[] y4= {1};
		 */
		
				int[] x = {1,2,3}; 
				int[] y = {7,3};
				int[] x1 = {1,2,3}; 
				int[] y1= {7,3,2};
				int[] x2 = {1,2,3}; 
				int[] y2= {1,3};
				int[] x3 = {1}; 
				int[] y3= {7,3};
				int[] x4 = {1,2,3}; 
				int[] y4= {1};
				
				System.out.println(sameLength(x, y));
				System.out.println(sameLength(x1, y1));
				System.out.println(sameLength(x2, y2));
				System.out.println(sameLength(x3, y3));
				System.out.println(sameLength(x4, y4));
	}
	public static String sameLength(int[] array, int[] array2) {
		
		
		if(!(array.length>1)) {
			return "Array1 is not valid";
		}
		if(!(array2.length>1)) {
			return "Array2 is not valid";
		}

	if(array[0]==array2[0] || array[array.length-1]==array2[array2.length-1]  ) {
				return "true";
			}else {
				return "false";
			}
		}
}
