package arrays;

import java.util.Scanner;

public class Basic {

	
	public static int suma(int a, int b) {
        int suma = a + b;
        return suma;
    }
	
	
	
	
public static void main(String[] args) {
	
	
	//lets work the basics for arrays
System.out.println("La suma es :" + (suma(25,67)));


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
	
//create a basic array with the numbers the user introduce
int [] arrayNumbers = {num,num2,num3,num4,num5};

System.out.println("El array de numeros es :");

for (int i=0; i<arrayNumbers.length;i++) {
	
	System.out.print(arrayNumbers[i] + " . ");
		
	
}
	
	
}
}
