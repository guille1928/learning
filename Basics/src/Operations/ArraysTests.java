package Operations;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTests {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		//i want to create an array and calculate some  values
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please introduce one number to set the array");
		int arrayValue = scanner.nextInt();
		int [] grades =  new int [arrayValue];
		
		System.out.println("Now introduce the grades for the length of the array");
		for (int i= 0 ; i <arrayValue;i++ ) {
			System.out.println("Introduce the student grade number " + (i+1));
			grades[i] = scanner.nextInt();
			System.out.println("it has been set the grade for position of the array "+ i);
			
		}
		System.out.println("The grades for the students are : " );
		for (int i = 0; i<grades.length;i++) {
			
			System.out.println(grades[i]);
			
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Lets see the average grade for the students ");
		//this will show the average for the grades, a a double not a int
		double averageGrade= Arrays.stream(grades).average().getAsDouble();
		System.out.println("The average grade for the students is : " +  averageGrade);
		
		
		//another method 
		
		int value = 0;
		
		for (int i= 0; i<grades.length; i++) {
			//we use value to sum the grades
			value += grades[i];
		
		}
		//for the average create a double
		
		double average= value/grades.length;
		System.out.println("The average grade for the students is :  " + average);
		
	}
	
}
