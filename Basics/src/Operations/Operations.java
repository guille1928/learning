package Operations;

import java.util.Scanner;

public class Operations {
	
	public static void main (String[] args) {
		
		System.out.println("Hello world");
		
		//first variables to validate some operations
		
		//multiply the number
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please write some number : ");
		int num = scanner.nextInt();
		
		for(int i = 0; i<11 ;i++) {
			int ope = i * num;
			//create a loop that will run 11 times multiplying the number 
			System.out.println("Number : " + num +" * " + i +" = " + ope );
			
			
		}
		
		
		
	}
	
	

}
