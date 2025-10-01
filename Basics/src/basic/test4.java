package basic;

import java.util.Scanner;

public class test4 {
	//pedir nombre y edad al usuario
	
	public static boolean compruebaEdad(int n) {
		return n >= 18;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Por favor introduce tu nombre :");
		String nombre = scn.next();
		
		System.out.println("Ahora dime tu edad :");
		int edad = scn.nextInt();
		
		if(compruebaEdad(edad)) {
			System.out.println("Hola, "+nombre+" . Eres mayor de edad.");
			
		}else {System.out.println("Hola, "+nombre+" . Eres menor de edad.");}
		scn.close();	
		
	}
}
