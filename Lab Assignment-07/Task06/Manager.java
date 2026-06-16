package Task06;

public class Manager extends Employee{

	public double bonus;

	public Manager(String n, double sal, int hours, double b){
		super(n, sal, hours);
		bonus=b;
	}

	public double calculateSalary(){

		double final_sal=getBaseSalary();

		if(getHoursWorked()>40){
			final_sal+=(final_sal*(bonus/100.0));
		}

		return final_sal;
	}

	public void requestIncrement(int m){

		if(getHoursWorked()>100){
			System.out.println("$"+m+" Increment approved");
			setBaseSalary(getBaseSalary()+m);
		}
		else if(getHoursWorked()>80){
			System.out.println("$"+m/2+" Increment approved");
			setBaseSalary(getBaseSalary()+(m/2));
		}
		else{
			System.out.println("Increment denied.");
		}
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("Bonus: "+bonus+" %"+"\nFinalSalary: "+calculateSalary());
	}
}