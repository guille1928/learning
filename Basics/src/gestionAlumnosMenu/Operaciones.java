package gestionAlumnosMenu;

public class Operaciones {
	String nombre;
	double nota;
	boolean exito = false;
	Alumno alumno = new Alumno(nombre , nota);
	
	public void insertAlumno (String nombre) {
		alumno.setNombre(nombre);
		}
	
}
