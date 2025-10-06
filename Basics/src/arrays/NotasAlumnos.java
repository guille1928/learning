package arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class NotasAlumnos {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int indiceUser= 0;
		do {
		System.out.println("¿ Cuantos alumnos tiene la clase ? Valor de 1 a 30");
			indiceUser = scn.nextInt();
		}while(indiceUser<=0 || indiceUser>30);
	
		
		//creamos el arraylist para que sea dinamico e incorpore a los alumnos
		ArrayList<Alumno> arrayAlumnos = new ArrayList<>(indiceUser);
		
		System.out.println("");
		System.out.println("Ahora vamos a guardar los nombres de los alumnos :");
		//poblema con iniciar el array o leerlo previamente
		for (int i=0;i<indiceUser;i++) {
			System.out.println("Escribe el nombre del nuevo alumno : "+"\n");
			String nom1 = scn.next().trim();
			double nota=0;
			
			do {
				System.out.println("Para el alumno/a con nombre : "+ nom1 +" ¿Qué nota tiene? :");
				System.out.println("Recuerda que debes introducir un valor del 0 al 10 ");
				nota = scn.nextDouble();
				}while (nota<0 || nota >10);
				
			//creamos un objeto nuevo de alumno 
			Alumno alumno = new Alumno(nom1, nota);
			arrayAlumnos.add(alumno);	
			//añadir un objeto alumno al arraylist	
			}
		System.out.println("");
		System.out.println("Los alumnos y sus notas son: ");
		for (int a=0;a<arrayAlumnos.size();a++) {
			System.out.println("El alumno/a : "+ arrayAlumnos.get(a).getNombre()+ " tiene una nota de : " + 
		arrayAlumnos.get(a).getNota());
			
		}
		System.out.println("");
		//creo objeto de operaciones y llamo a su funcion
		Operaciones op = new Operaciones();
		System.out.println("La nota media de todos los alumnos es : "+op.notaMedia(arrayAlumnos));
		System.out.println("La nota mas alta de todos los alumnos es : ");
		System.out.println(op.notaAlta(arrayAlumnos));
		System.out.println("");
		System.out.println("La nota mas baja de todos los alumnos es : ");
		System.out.println(op.notaBaja(arrayAlumnos));
		scn.close();
		}
		
	}
	
	
	

