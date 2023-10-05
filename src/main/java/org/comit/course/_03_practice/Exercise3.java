package org.comit.course._03_practice;

public class Exercise3 {

	public static void main(String[] args) {
		// 3.  Write a Java program that, given a year, 
		//prints out whether it is a leap year or not.
		
		//Just a reminder: 
		// a leap year is divisible by 4 AND NOT divisible by 100 OR divisible by 400 
		// (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
		
		int year = 304;
		if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
			System.out.println("It's a Leap Year");
		} else {
			System.out.println("It's not a Leap Year");
		}
	}

}
