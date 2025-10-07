package gestionAlumnosMenu;

import java.util.ArrayList;

public class Operaciones {
	String nombre;
	double nota;
	boolean exito = false;
	Alumno alumno = new Alumno(nombre , nota);
	
	public void insertAlumno (String nombre) {
		alumno.setNombre(nombre);
		}
	
	public String mostrarAlumnos () {
	String lista="";
	ArrayList<Alumno> listaAlumno = new ArrayList<>();
	for (int i=0; i<listaAlumno.size();i++) {
		lista= listaAlumno.get(i).getNombre();
	}	
	return lista;	
		
	}
	
	
}
