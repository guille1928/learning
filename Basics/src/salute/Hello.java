package salute;

import java.util.Scanner;

public class Hello {
	//we will work with text chains
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//we ask for the name and the middlename 
		System.out.println("Hello!, please enter your name ");
		String name = scanner.nextLine();
		System.out.println("Enter your midname ");
		String midname = scanner.nextLine();
		
		System.out.println("Hello "+name+" , wellcome to this program called salute \n" +
		" your middle name is : " + midname
		);
	} 
}
