package org.comit.course._03_practice;

public class Exercise9 {

	public static void main(String[] args) {
		// Write a program in Java that prints the first 30 even numbers in the console.
	    
		// Carlos correction
//		for(int i = 1; i <= 30; i++) {
//			System.out.println(i * 2);
//		}
//		System.out.println("");
//		System.out.println("");
	
		int count = 30;
		int number = 1;
		
		for(int i = 1; i <= count; i++) {
			if (number % 2 == 0) {
			System.out.println(number);
			}
		}
		
	}

}
