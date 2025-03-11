package Operations;

import java.util.Scanner;

public class ArraysTests2 {

	public static void main(String[] args) {
		
		//lest ask the user for a string,, and lets try to invert the order of the string
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please , introduce one sentence ");
		String sentenceUser = scanner.nextLine();
		
		String [] arrayString = {sentenceUser};
			
		//just trying to read the array
		System.out.println("normal");
		for (int i = 0; i<arrayString.length; i++) {
			
			System.out.println(arrayString[i]);
		}
		
		int num = arrayString.length;
		
		
		System.out.println("new try");
		for (int i = num ; i<0 ; i++) {
			System.out.println(arrayString[i]);
			
		}
		
		
		
		
		
		
	}
}
