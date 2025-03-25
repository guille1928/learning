package clases;

public class Worker {
	//we will work with a class , its atributes and getters and setters
	
	//variables 
	String name;
	int age ;
	double salary;
	
	//methods for the getters and setters
	public void setName (String nameConsole) {
		
	this.name = nameConsole;
	}
	
	
	public String getName() {
		
		return name;
	}
	

	public void setYears (int yearsConsole) {
	this.age= yearsConsole;	
		
	}
	
	public int getYears() {
		
		return age;
		
	
	}
	
	public void setSalary (double salaryConsole) {
		
		this.salary= salaryConsole;
	}
	
	
	public double getSalary () {
		
		return salary;
	}
	
	
	
}

