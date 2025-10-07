package gestionAlumnosMenu;

import java.util.Scanner;

public class MainMenu {

	//pediremos al usuario que elige de un menu interactivo en la consola
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		//creamos el switch para las opciones 
		
		System.out.println("--Gestión de alumnos--  \n"
			+ "1. Agregar alumno \n"
			+ "2. Mostrar todos los alumnos \n" 
			+ "3. Calcular nota media \n" 
			+ "4. Mostrar nota mas baja \n"
			+ "5. Mostrar nota mas alta \n"
			+ "6. Salir \n"
			+ "Elige una opción: ");
		Operaciones op = new Operaciones();
		switch(scn.nextInt()) {
		case 1:{
			System.out.println("Nombre del usuario : ");
			op.insertAlumno(scn.next().trim());
			System.out.println("Se agregó el alumno");
		}
		case 2: {
			System.out.println("La lista de alumnos es : ");
			System.out.println(op.mostrarAlumnos());
		}
		
		
		
		}
		
		
		
		
		
	}


	
}
