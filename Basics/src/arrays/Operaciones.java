package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Operaciones {
	
	
	
	/*necesito varios metodos para calcular la nota media y las notas mas altas de los alumnos
	pedimos nota media del array notas y la retornamos*/
		
	
	
	public double notaMedia(ArrayList<Alumno> array) {
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
		public String notaAlta (ArrayList<Alumno> array) {
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
			return (nombre+" "+value2);
				
		
		} 
	
		//nota minima
		public String notaBaja (ArrayList<Alumno> array) {
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
			return (nombre+" "+value2);
			}
		
	
	
	
}
