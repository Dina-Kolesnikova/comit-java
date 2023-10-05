package org.comit.course._03_practice;

public class Exercise5 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program for the following scenario: 
		 *  A student will not be allowed to sit in an exam if his attendance 
		 *  is less than 75%. 
		 *  
		 *  Given the number of classes held and the number 
		 *  of classes attended, print out the percentage 
		 *  of classes attended and whether the student 
		 *  is allowed to sit in the exam or not.
    

  			- int classesHeld = 9;
			- int classesAttented = 6;
		 */
		
		
		int classesHeld = 9;
		int classesAttented = 6;
		
		double allowedForExam = classesAttented * 100 / classesHeld;
		
		
		if (allowedForExam > 75) {
			System.out.println("You can sit in an exam");
		} else {
			System.out.println("You can't be preset at an exam");
}

	}

}
