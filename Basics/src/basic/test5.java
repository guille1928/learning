package basic;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	
	/*public static int promedio (int [] ) {
	promedio = 0;
	return promedio;	
	}
	*/
	public static void main(String[] args) {
		//pedimos 5 numeros al user
		Scanner scn = new Scanner(System.in);
		
		int [] arrayNum= new int [5];
		int n= arrayNum[0];
		do {
		System.out.println("Introduce un número  ");
		int num= scn.nextInt();
		arrayNum[n] = num;
		n++;
		}
		while (n<arrayNum.length);
		//mecanismo 1 utilizando Arrays.Stream
		double media= Arrays.stream(arrayNum).average().getAsDouble();
		System.out.println("El promedio de los numeros del array es " + media);
		
		System.out.println("");
		//mecanismo realizando un for
		double suma= 0;
		for (int i=0; i<arrayNum.length;i++) {
			int n1 = arrayNum[i];
			suma+=n1;
			
		}
		
		System.out.println("La otra media sería : "+ (suma/arrayNum.length));
	}
	
	
}
