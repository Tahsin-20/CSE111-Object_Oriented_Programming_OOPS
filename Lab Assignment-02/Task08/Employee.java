package Task08;

public class Employee{

	public String name_emp;
	public double sal;
	public String desig;

	public Employee(){
		sal=30000.0;
		desig="junior";
	}

	public void newEmployee(String name){
		name_emp=name;
	}

	public void displayInfo(){
		System.out.println("Employee Name: "+name_emp);
		System.out.println("Employee Salary: "+sal+" Tk");
		System.out.println("Employee Designation: "+desig);
	}
	public void calculateTax(){

		if(sal>50000.0){
			double tax=(sal*30)/100;
			System.out.println(name_emp+" Tax Amount: "+tax+ "Tk");
		}
		else if(sal>30000.0){
			double tax=(sal*10)/100;
			System.out.println(name_emp+" Tax Amount: "+tax+ "Tk");
		}
		else{
			System.out.println("No need to pay tax");
		}
	}
	public void promoteEmployee(String prom){
		if(prom.equalsIgnoreCase("lead")){
			sal+=50000.0;
			desig="lead";
			System.out.println(name_emp+" has been promoted to "+desig);
			System.out.println("New Salary: "+sal+" Tk");
		}
		else if(prom.equalsIgnoreCase("senior")){
			sal+=25000.0;
			desig="senior";
			System.out.println(name_emp+" has been promoted to "+desig);
			System.out.println("New Salary: "+sal+" Tk");
		}
		else if(prom.equalsIgnoreCase("manager")){
			sal+=75000.0;
			desig="manager";
			System.out.println(name_emp+" has been promoted to "+desig);
			System.out.println("New Salary: "+sal+" Tk");
		}
	}
}
