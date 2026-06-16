package Task06;

public class Developer extends Employee{

	public double final_sal;
	public String lang;

	public Developer(String n, double s, int h, String l){
		super(n, s, h);
		lang=l;
	}

	public void calculateSalary(){

		if(lang.equals("Java")){

			final_sal=getBaseSalary()+700;
		}
		else{
			final_sal=getBaseSalary();
		}
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("Language: "+lang+"\nFinalSalary: "+final_sal);
	}
}
