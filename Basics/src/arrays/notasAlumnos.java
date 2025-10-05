package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class notasAlumnos {

	//necesito varios metodos para calcular la nota media y las notas mas altas de los alumnos
	
	//pedimos nota media del array notas y la retornamos
	public static double notaMedia(ArrayList<Alumno> array) {
		double []notas = new double [array.size()];
		//iteramos y le asignamos al array las notas del alumno
		for (int i=0; i<array.size();i++){
			notas[i]= array.get(i).getNota();	
			}
		double notamedia = 0;
		notamedia = Arrays.stream(notas).average().getAsDouble();
		return notamedia;
		}
	
	
	
	//tendremos que dar un nombre y su nota mas alta 
	//nota maxima
	public static void notaAlta (ArrayList<Alumno> array) {
		String nombre="";
		double value2= array.get(0).getNota();
		//necesito obtener el indice para relacionar al alumno
		for (int i=0; i<array.size();i++) {
			double max= array.get(i).getNota();
			if (max>=value2) {
				value2= max;
				nombre= array.get(i).getNombre();			
				//le aplico el indice para darselo al array de nombres 
			}	
		
		}
		System.out.println(nombre+" "+value2);
			
	
	} 
	//nota minima
	public static void notaBaja (ArrayList<Alumno> array) {
				String nombre="";
				double value2= array.get(0).getNota();
				//necesito obtener el indice para relacionar al alumno
				for (int i=0; i<array.size();i++) {
					double min= array.get(i).getNota();
					if (min<=value2) {
						value2= min;
						nombre= array.get(i).getNombre();
						//le aplico el indice para darselo al array de nombres 
					}	
				
				}
				System.out.println(nombre+" "+value2);
		}
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("¿ Cuantos alumnos tiene la clase ?");
		int indiceUser = scn.nextInt();
		//creamos el arraylist para que sea dinamico e incorpore a los alumnos
		ArrayList<Alumno> arrayAlumnos = new ArrayList<>(indiceUser);
		
		System.out.println("");
		System.out.println("Ahora vamos a guardar los nombres de los alumnos :");
		//poblema con iniciar el array o leerlo previamente
		for (int i=0;i<indiceUser;i++) {
			System.out.println("Escribe el nombre del nuevo alumno : "+"\n");
			String nom1 = scn.next().trim();
			System.out.println("Para el alumno/a con nombre : "+ nom1 +" ¿Qué nota tiene/n? :");
			double nota = scn.nextDouble();	
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
		
		
		System.out.println("La nota media de todos los alumnos es : "+notaMedia(arrayAlumnos));
		
		
		System.out.println("La nota mas alta de todos los alumnos es : ");
		notaAlta(arrayAlumnos);
		System.out.println("");
		System.out.println("La nota mas baja de todos los alumnos es : ");
		notaBaja(arrayAlumnos);
		}
	
	}
	
	
	

