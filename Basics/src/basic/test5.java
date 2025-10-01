package basic;


import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	

	public static void main(String[] args) {
		//pedimos 5 numeros al user
		Scanner scn = new Scanner(System.in);
		int n= 0;
		int [] arrayNum = new int [5];
		int [] arrayNum2 = new int [5];
		
		
		 do {
			
			System.out.println("Introduce un número para el primer array  ");
			arrayNum2[n]= scn.nextInt();
			n++;
		 	}
		while (n< arrayNum2.length);
		
		 
		 for (int i=0;i<arrayNum.length;i++) {
			 System.out.println("Dame un numero");
			 arrayNum[i]=scn.nextInt();
 
		 }
		 
	
		double media = Arrays.stream(arrayNum).average().getAsDouble();
		double media2 = Arrays.stream(arrayNum2).average().getAsDouble();
		System.out.println("El promedio de los numeros del array es " + media);
		System.out.println("El promedio de los numeros del array es " + media2);
	
		
		scn.close();
	
	
	}
	
	
}
