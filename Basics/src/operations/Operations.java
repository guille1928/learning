package operations;

import java.util.Scanner;

public class Operations {
	
	public static void main (String[] args) {
		
		System.out.println("Hello world");
		
		//first variables to validate some operations
		
		//multiply the number
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please write any number : ");
		int num = scanner.nextInt();
		
		for(int i = 0; i<11 ;i++) {
			int ope = i * num;
			//create a loop that will run 11 times multiplying the number 
			System.out.println("Number : " + num +" * " + i +" = " + ope );
			
			
		}
		//find if a number is even or odd
		System.out.println("----------------------------------");
		System.out.println("Now write another number \nand i will tell you if is an odd or even number");
		int oddEven= scanner.nextInt();
		if(oddEven%2==0) {
			System.out.println("Its even");
		} else {System.out.println("Its odd");}
		
		//find the highest number between three numbers
		System.out.println("----------------------------------");
		System.out.println("Lets find out the highest number");
		System.out.println("Please introduce the first number");
		int num1 = scanner.nextInt();
		System.out.println("Please introduce the second number");
		int num2 = scanner.nextInt();
		System.out.println("Please introduce the third number");
		int num3 = scanner.nextInt();
		
		
		int highest = Math.max(num1, num2);
		if (highest < num3) {
			System.out.println("The number : "+ num3 +" is the biggest" );
		}else {System.out.println("The number :" + highest +" is the biggest");}
		
		//another way more eficient
		int highest2 = Math.max(num1, Math.max(num2, num3));
		System.out.println("The highest number is : "+highest2);
		
		
		//the factorial number
		System.out.println("----------------------------------");
		System.out.println("Lets calculate the factorial of a number");
		int factorial = 1;
		System.out.println("Please write any number : ");
		int num5= scanner.nextInt();
		for (int i = 1 ; i<=num5 ; i++) {
			
			factorial *= i;
		}
		
		System.out.println("The factorial of : " + num5 + " is :" + factorial);
		
		
		
		//prime number

		System.out.println("----------------------------------");
		System.out.println("Introduce another number to see if is a prime");
		
		int numPrime = scanner.nextInt();
		
		boolean isPrime= numPrime >1;
		
		for (int i =2 ; i<numPrime; i++){
			
			if(numPrime%i ==0 ) {
				isPrime= false;
				break;
				}
			}	
		if(isPrime) {System.out.println("The number is prime");
			}else {System.out.println("Is not prime");

			}	
		
		
	
		//lets try to sum the digits from a number
		System.out.println("----------------------------------");
		System.out.println("Plese introduce a number with 2 digits");
		int numbConsole = scanner.nextInt();
		
		int decena = numbConsole/10;
		int centena = numbConsole%10;
	
		int suma = decena + centena ;
		System.out.println("decena "+decena + "centena " +centena);
		System.out.println("The sum of both digits of "+ numbConsole + " is : " + suma);
		
		System.out.println("----------------------------------");
		//for any tipe of number
		System.out.println("Now introduce any kind of number ");
		int numbConsole2 = scanner.nextInt();
		int suma2 = 0;
		
		while (numbConsole2 >0) {
			suma2 += numbConsole2%10;
			numbConsole2 /= 10;
			
		}
		System.out.println("The sum of its digits is " +suma2);
		
		
		//Lets write the Fibonacci series 
		System.out.println("----------------------------------");
		//for any tipe of number
		System.out.println("Now introduce any kind of number to see the Fibonacci series");
		int fibo = scanner.nextInt();
		int a = 0, b= 1;
		
		for (int i = 0 ; i<fibo ; i++) {
			System.out.println(a +" ");
			int temp = a+b;
			a=b;
			b= temp;
			
		}
		
		
		
	}
}
