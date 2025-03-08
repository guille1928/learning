package Operations;

import java.util.Scanner;

public class Calculations {
	//function for calculate the radio of a circle
	public static double calculate (double radio) {
	
	double area = Math.PI*Math.pow(radio, 2);
	return area;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);	
	System.out.println("Please introduce the radio of the circle");
	double radio = scanner.nextDouble();
	//call the function 
	double area =calculate(radio);
	System.out.println("The area of the circle is : " + area);
		
		
		
	}
	
	
	
	
}
