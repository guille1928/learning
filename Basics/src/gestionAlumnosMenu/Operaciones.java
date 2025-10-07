package gestionAlumnosMenu;

import java.util.ArrayList;

public class Operaciones {
	String nombre;
	double nota;
	boolean exito = false;
	private ArrayList<Alumno> lista = new ArrayList<Alumno>();
	
	
	public void insertAlumno (String nombre1, double nota1) {
		Alumno alumno = new Alumno(nombre1 , nota1);
		lista.add(alumno);
		}
	
	public void mostrarAlumnos () {
	
	for (int i=0; i<lista.size();i++) {
		String nombre= lista.get(i).getNombre().toString();
		Double nota = lista.get(i).getNota();
		System.out.println("El usuario/a : "+nombre +" tiene una nota de : " +nota );
	}
	}
	
	
	
	
}
