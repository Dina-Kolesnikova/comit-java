package org.comit.course._03_practice;

public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program for the following scenario: 
		 * A company decides to give a bonus of 5% to the employees if their 
		 * years of service are more than 5 years. So, given a number 
		 * of years of service and a salary, print out the bonus.
		 * 	- int years = 8;
		 * 	- double salary = 65000;
		 */
		
		int years = 8;
		double salary = 65000;
		
		double bonus = salary * 0.05;
		
		if (years > 5) {
			System.out.println("Your bonus is: " + bonus);
		} else {
			System.out.println("You need work more! Your bonus is 0");
		}
	}

}
