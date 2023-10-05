package org.comit.course._03_practice;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that, given three numbers, 
		 * prints out the greatest number.
			int num1 = 48;
			int num2 = 12;
			int num3 = 37;

		 */
		
		int num1 = 48;
		int num2 = 12;
		int num3 = 37;
		
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is the greatest number");
				return;
			}
		}
		
		else {
			if (num2 > num3) {
				System.out.println(num2 + " is the greatest number");
				return;
			}
		}
		
		System.out.println(num3 + " is the greatest number");
		//System.out.println(num2 + " is the greatest number");
	
	}

}
