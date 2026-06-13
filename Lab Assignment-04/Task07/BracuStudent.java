package Task07;

public class BracuStudent{

	public String name;
	public String area;
	public boolean pass=false;

	public BracuStudent(String n, String a){
		name=n;
		area=a;
	}
	public void showDetails(){

		System.out.println("Student Name: "+name);
		System.out.println("Lives in "+area);

		if(pass==true){
			System.out.println("Have Bus Pass? "+pass);
		}
		else{
			System.out.println("Have Bus Pass? "+pass);
		}
	}
	public void updateHome(String hom){
		area=hom;
	}
	public void getPass(){
		pass=true;
	}
	public boolean pass(){
		return pass;
	}
	public String name(){
		return name;
	}
	public String home(){
		return area;
	}
}