package Operations;

import java.util.Scanner;

public class ArraysTests2 {

	public static void main(String[] args) {
		
		//lest ask the user for a string,, and lets try to invert the order of the string
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please , introduce one sentence ");
		String sentenceUser = scanner.nextLine();
		//create an Array of strings
		String [] arrayString = sentenceUser.split(" ");
		//use StringBuilder to use append and reverse
		StringBuilder str = new StringBuilder();
		str.append(sentenceUser);
		StringBuilder reverse = str.reverse();
		System.out.println("New try with StringBuilder");
		System.out.println(reverse);
		//read the array in reserve mode
		System.out.println("-----------------------------------");
		System.out.println("New try with an Array of strings");
		for (int i = arrayString.length -1; i>=0 ;i--) {
			System.out.print(arrayString[i] + " ");
		}
		
		
		
		
		
	}
}
