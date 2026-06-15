package Task06;

public class Cargo{

	public static double max_cap=10.0;
	public static double t_weight;
	public static int id1=1;

	public String content;
	public double weight;
	public boolean bool=false;
	public int id;

	public static double capacity(){
		double cap=max_cap-t_weight;
		return cap;
	}

	public Cargo(String c, double w){
		content=c;
		weight=w;
		id=id1++;
	}

	public void details(){
		System.out.println("Cargo ID: "+id+", "+"Contents: "+content+", "+"Weight: "+weight+", "+"Loaded: "+bool);
	}

	public void load(){

		if(t_weight+weight<=max_cap){
			t_weight+=weight;
			bool=true;
			System.out.println("Cargo "+id+" loaded for transport.");
		}
		else{
			System.out.println("Cannot load cargo, exceeds weight capacity.");
		}
	}

	public void unload(){

		if(bool==true){
			t_weight-=weight;
			bool=false;
			System.out.println("Cargo "+id+" unloaded.");
		}
	}
}
