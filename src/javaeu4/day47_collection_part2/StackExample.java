package javaeu4.day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		
		//stack structuree-->last in first out
		
		Stack<Integer> numStack = new Stack<>();
		
		//creating object
		//1. regular way --> class-class
		//2. poly -->parent/interface--class
		
		Vector<Integer> numstack = new Stack<>();//ploy way creat objec
		//eğer bu yöntemle oluşturursak satck rekii methodlara ulaşmak için down castin ihtiyaç olur
 
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(50);
		
		System.out.println(numStack.toString());
		
		//check value on top of stack-->peek()-->en baştaki değeri verir
		System.out.println(numStack.peek());
		
		//read value on top of stack then remove it
		numStack.pop();

		System.out.println(numStack.toString());
		
		System.out.println(numStack.peek());
		
		System.out.println(numStack.get(0));
	}

}
