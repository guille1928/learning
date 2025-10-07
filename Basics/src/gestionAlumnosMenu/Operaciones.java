package gestionAlumnosMenu;

import java.util.ArrayList;

public class Operaciones {
	//creamos el arraylist para operaciones con los alumnos que creemos
	private ArrayList<Alumno> alumArray = new ArrayList<Alumno>();
	//creamos la funcion para introducir alumnos
	public void insertAlumno (String nombre, double nota) {
		Alumno alumno = new Alumno(nombre, nota);
		alumArray.add(alumno);	
	}
	
	//mostrar todos los alumnos
	public String mostrarAlumnos () {
		if(alumArray.isEmpty()) {
			return "No hay alumnos registrados";
			}
		StringBuilder sb = new StringBuilder();
		for (Alumno n : alumArray) {
			sb.append("El alumno/a : ")
			.append(n.getNombre() ) 
			.append(" tiene una nota de : ")
			.append(n.getNota())
			.append("\n");
			}
		return sb.toString();
		
	}
	
	//calculamos las notas en un array con stream 
	
	public String notaMedia () {
		if(alumArray.isEmpty()) {
		return "No hay alumnos registrados"; 

		}	
		double media= 0;
		for(Alumno n : alumArray) {
			double nota = n.getNota();
			media +=nota;
		}
		String mediaString = String.valueOf(media/alumArray.size());
		return mediaString;
		
	}
	
	//calculo de la nota mas alta
	public String notaAlta () {
		double max= Double.MIN_VALUE;
		String alumno = "";
		if(alumArray.isEmpty()) {
			return "No hay alumnos registrados";
			}	
		for (Alumno n : alumArray) {
			if (n.getNota()>max) {
				max  = n.getNota();
				alumno= n.getNombre();
			}
			}
		String nota = String.valueOf(max);
	return alumno + " " +nota;	
	}
	
	
	//nota mas baja
	public String notaBaja () {
		String alumno = "";
		double min= Double.MAX_VALUE;
		if(alumArray.isEmpty()) {
			return "No hay alumnos registrados" ;
			}	
		for (Alumno n : alumArray) {	
			if(n.getNota()<min) {
				min=n.getNota();
				alumno= n.getNombre();
				}
			}
	String mini= String.valueOf(min);
	return alumno + " " + mini;	
	}

}
