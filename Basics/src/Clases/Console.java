package Clases;

import java.util.Scanner;




public class Console {
//we will call the methods from the class Worker to see and understand the class options
	
	public static void main(String[] args) {
		
		
	//first we need to set with the setters the name, age and salary of the worker
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wellcome to the workers program");
		System.out.println("-------------------------------");
		System.out.println("Please introduce the name of the worker");
		String nameConsole = scanner.nextLine();
		System.out.println("Please introduce the age of the worker");
		int yearsOld = scanner.nextInt();
		System.out.println("Please introduce the salary of the worker ");
		double salaryConsole = scanner.nextDouble();
		Worker newWorker = new Worker();
		//now we set with the class methods the atributes
		newWorker.setName(nameConsole);
		newWorker.setYears(yearsOld);
		newWorker.setSalary(salaryConsole);
		
		//we use the getters to know his name, age and salary
		System.out.println(newWorker.getName() + " is " + newWorker.getYears()+" old " + " and has a salary of  " + newWorker.getSalary());
		
		
	}

	
	
}
