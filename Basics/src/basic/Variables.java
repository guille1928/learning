package basic;

import java.util.Scanner;

public class Variables {
	
	public static void main(String[] args) {
		
		//nuevas variables 
		
		int num = 1;
		double numdouble = 233.45;
		
		System.out.println("El primer numero primitivo entero es ; "+num);
		System.out.println("El segundo numero primitivo double es ; "+numdouble);
		
		
		
		//siguiente suma 
		
		int num2= 28;
		
		if (num > num2) {
			
			System.out.println ("El numero : " + num +" es mayor que : " + num2);
		}else {System.out.println ("El numero : " + num2 + " es mayor que : " + num);
			}
		
		
		System.out.println("");
		
		System.out.println ("La suma de los numeros primitivos es : " + (num + num2));
		
		System.out.println("");
		
		System.out.println("Siguiente prueba de un condicional ");
		
		System.out.println("Vamos a pedir un numero por consola al usuario ");
		
		
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("introduce un numero del 1 al 10 ");
		
		int num3 = scn.nextInt();
		
		if (num3 < 1 || num3 >10) {
			int num4 ;
			System.out.println ("Debes introducir un valor del 1 al 10 ");
			System.out.println("El numero introducido es : " + num3);
			do {
				System.out.println("introduce de nuevo el numero del 1 al 10 ");
				
				 num4 = scn.nextInt();	
				
				
				} while (num4 < 1 || num4 >10);
			
				System.out.println("Numero elegido correcto . Es el numero : "+ num4);
				
		} 
	}
}
