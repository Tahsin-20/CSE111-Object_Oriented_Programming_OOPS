package Task02;

public class Passenger{

	public static int no_of_passenger;
	public static double total_fare;
	public String pass_name;
	public double fare;
	public double weight_fare;
	public double weight;

	public Passenger(String n, double d){
		pass_name=n;
		fare=(d*20.0);
		total_fare+=fare;
		no_of_passenger++;
	}

	public void storeBaggageWeight(double w){
		weight=w;
		weight_fare=w*10.0;
		fare+=weight_fare;
		total_fare+=weight_fare;
	}

	public void passengerDetails(){
		System.out.println("Name: "+pass_name);
		System.out.println("Fare: "+fare+" TK");
	}
}
