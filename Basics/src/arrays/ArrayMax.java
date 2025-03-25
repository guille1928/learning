package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
	
	
	
public static void main(String[] args) {
	//lets find the biggest number of the array
	
Scanner scanner = new Scanner (System.in);
	

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
//create the array
int[] basic = {num,num2,num3,num4,num5};
//run the array
System.out.println("The numbers are  : ");
	for (int i = 0; i <basic.length ; i++) {
		System.out.print(" " + basic[i]);
		
		
	}
	System.out.println(" ");
//use the arrays max to get the biggest number
int biggestNumber = Arrays.stream(basic).max().getAsInt();
	System.out.println("The biggest number of the array is : " + biggestNumber);
	
}
}
