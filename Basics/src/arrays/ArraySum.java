package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

	
		//lets sum the values of the array
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		

System.out.println("Please introduce the first number for the array");
	int num = scanner.nextInt();
System.out.println("Please introduce the second number for the array");
	int num2 = scanner.nextInt();
System.out.println("Please introduce the third number for the array");
	int num3 = scanner.nextInt();
System.out.println("Please introduce the fourth number for the array");
	int num4 = scanner.nextInt();
System.out.println("Please introduce the last number for the array");
	int num5 = scanner.nextInt();
//create the array with the values
int[] basicSum = {num,num2,num3,num4,num5};


for (int i =0; i<basicSum.length;i++) {
	System.out.print (" "+ basicSum[i]);
	
}
//use Arrays class to sum the numbers
int sum = Arrays.stream(basicSum).sum();
System.out.println(" ");
System.out.println("The sum using Arrays class is : "+ sum);



		
	}
}
