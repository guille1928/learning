package arrays;

public class InvertValues {

	
	//lets invert the values of 1 array
	
	
	
	public static void main(String[] args) {
		
		//read the numbers of the array in order
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("In order ");
		System.out.println("----------------------------");
		for(int i = 0; i<numbers.length;i++) {
			
			System.out.print(" "+ numbers[i]);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Change the order ");
		System.out.println("----------------------------");
		//lets try change the order of the values 
		for(int i = numbers.length-1;i>=0;i--) {
		//we declare an int with the array length minus 1	
			System.out.print(" "+ numbers[i]);
		}
	}
	
}
