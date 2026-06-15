package Task07;

public class Student{

	public static int t_stu;
	public static int cse_stu;
	public static int other_stu;
	public static int id1=1;

	public String name;
	public double cgpa;
	public String dept;
	public int id;

	public static void printDetails(){
		System.out.println("Total Student(s): "+t_stu);
		System.out.println("CSE Student(s): "+cse_stu);
		System.out.println("Other Department Student(s): "+other_stu);
	}

	public Student(String n, double cg){
		name=n;
		cgpa=cg;
		dept="CSE";
		id=id1++;
		cse_stu++;
		t_stu++;
	}

	public void individualDetail(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Department: "+dept);
	}

	public Student(String n, double cg, String d){
		name=n;
		cgpa=cg;
		dept=d;
		id=id1++;
		other_stu++;
		t_stu++;
	}
}