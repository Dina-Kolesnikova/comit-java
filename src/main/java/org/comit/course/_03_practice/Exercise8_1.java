package org.comit.course._03_practice;

public class Exercise8_1 {

	public static void main(String[] args) {
	

		// Write a program in Java that prints the first 20 prime numbers in the console.
		// A prime number is defined as a natural number greater 
		// than 1 and is divisible by only 1 and itself. 
		
		int counter = 0; //How many prime did we found  
		int i = 2; // Current number 
		
		while (counter <= 20) {
			boolean isIAPrime = true; 
			for(int previous = i - 1 ; previous > 1 ; previous--) {
				if(i % previous == 0) {
					isIAPrime = false;
					break;
				}
			}
			if(isIAPrime) {
				counter++;
				System.out.println(i);
			}
			i++;
		
		}
		
		
		
		
		
		
		
		
		
	}

}
