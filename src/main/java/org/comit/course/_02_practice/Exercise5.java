package org.comit.course._02_practice;

public class Exercise5 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print out the values of the following expressions:
			a) (101 + 0) / 3
			b) 3.0e-6 * 10000000.1
			c) true && true
			d) false && true
			e) (false && false) || (true && true)
			f) (false || false) && (true && true)

		 */
		
		double a = (double)(101 + 0) / 3;
		double b = 3.0e-6 * 10000000.1; // 30.0000003
		boolean c = true && true;
		boolean d = false && true;
		boolean e = (false && false) || (true && true);
		boolean f = (false || false) && (true && true);
		
		System.out.println(a);
		System.out.println(3.0e-6 * 10000000.1);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		

	}

}
