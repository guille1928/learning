package basic;

import java.util.Scanner;

public class testing {

	//pedir numero entero y printar por consola resultado
	
	//creo un metodo para verificar si es par o impar
	
	public static void comprueba (int n) {
		
		if(n%2 ==0) {
			
			System.out.println("El numero es par");
			
		}else {
			
			System.out.println("El numero es impar");}

	}

	public static boolean comprueba2 (int n) {
		return n%2==0;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		
		int num = scn.nextInt();
		//verificar si par o impar
		
		
		System.out.println("El numero introducido es : " + num);
		comprueba(num);
		
		System.out.println("¿El número es par? " + " "+comprueba2(num));
		scn.close();
	}
	
}
	

