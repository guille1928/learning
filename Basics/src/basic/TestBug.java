package basic;

import java.util.logging.Logger;

public class TestBug {
	private static final Logger logger = Logger.getLogger(TestBug.class.getName());
	static int [] arrayNum = {2,4,-1,7,12,23};
	//function to get the max value of the array
	public static void maxValor (int [] array) {
		//lets use for loop for testing
		int maximo1=array[0];
		
		for (int i=0;i<array.length;i++) {
			int max = array[i];
			if(max>maximo1) {
			maximo1=max;	
			}		
		}
		logger.info("El valor maximo es : " + maximo1); 
		System.out.println("El valor maximo es : " + maximo1);
		}	
	
	//function to get the average value of the array 
	public static int average () {
	int suma=0;
	for (int n : arrayNum) {
	suma +=n;	
	}
	return suma/arrayNum.length;
	}
	
	//boolean to check if any number is greater than 10 
	public static void existe (int [] array) {
	int i1 = 10;
	boolean mayor = false;
	for(int i=0;i<arrayNum.length;i++) {
		mayor= (arrayNum[i] >i1);
		if (mayor) {
			logger.info("Existe un numero mayor a 10 y es : " + arrayNum[i]);
		}
	}
	if(mayor!=true) {logger.info("No existe un numero mayor a 10");}
	
	}
	
	
	public static void main(String[] args) {
		
		
		for (int i = 0 ; i< arrayNum.length; i++) {
			logger.info(arrayNum[i]+" ");
		}
		System.out.println(" ");
		
		maxValor(arrayNum);
		average();
		existe(arrayNum);
		
				
		}
		
		
}
