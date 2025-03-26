package arrays;

import java.nio.file.FileSystem;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class FindElement {

	
	
	//lets try and find an element of the array
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String[] names = {"John","Martha","Will","Mark"};
		
		//ask for the element to find
		
		System.out.println("Tell me the workers name, i will tell if it is on this list ");
		String nameUser = scanner.next().trim();
		//we run the array
		for(int i = 0; i<names.length ;i++) {
			//if any value constains the name introduce by the user, tells the user and finish the program.
			if (names[i].contains(nameUser)) {
				System.out.println("The name : " + nameUser+" is on the list");
				System.exit(1);
	
				}
			
		}
		//tells the user the name is not on the list
		System.out.println("The name you introduce is not on the list");
		
		
	}
}