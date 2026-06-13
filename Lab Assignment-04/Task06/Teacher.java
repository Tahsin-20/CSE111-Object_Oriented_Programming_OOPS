package Task06;

public class Teacher{

	public String name;
	public String ini;

	public Course[]arrc=new Course[3];

	public int count;

	public Teacher(String n, String i){
		name=n;
		ini=i;
		System.out.println("A new teacher has been created");
	}

	public void printDetail(){
		System.out.println("Name: "+name);
		System.out.println("Initial: "+ini);
		System.out.println("List of courses:");

		for(int i=0; i<count; i++){
			System.out.println(arrc[i].cour);
		}
	}
	public void addCourse(Course c){
		if(count<3){
			arrc[count]=c;
			count++;
		}
	}
}
