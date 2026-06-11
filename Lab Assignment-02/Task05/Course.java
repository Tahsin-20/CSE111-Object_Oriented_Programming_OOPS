package Task05;

public class Course{

	public String name;
	public String code;
	public int credit;

	public void displayCourse(){
		System.out.println("Course Name: "+name);
		System.out.println("Course Code: "+code);
		System.out.println("Course Credit "+credit);

	}
	public void updateDetails(String courseName, String courseCode, int courseCredit){
		this.name=courseName;
		this.code=courseCode;
		this.credit=courseCredit;
	}
}
