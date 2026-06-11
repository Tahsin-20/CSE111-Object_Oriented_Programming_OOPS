package Task01b;

public class UniversityTester{
	public static void main(String[]args){

		University u1=new University();
		u1.name="Imperial College London";
		u1.country="England";
		System.out.println(u1.name);
		System.out.println(u1.country);

		University u2=new University();
		u2.name="Brac University";
		u2.country="Bangladesh";
		System.out.println(u2.name);
		System.out.println(u2.country);

		if(u1.name.equals("null") && u1.country.equals("null")){
			System.out.println("Not Changed");
		}
		else{
			System.out.println("Changed");
		}

		if(u2.name.equals("null") && u2.country.equals("null")){
			System.out.println("Not Changed");
		}
		else{
			System.out.println("Changed");
		}

		if(u1.name.equals(u2.name) && u1.country.equals(u2.country)){
			System.out.println("Not Changed");
		}
		else{
			System.out.println("Changed");
		}

	}
}
