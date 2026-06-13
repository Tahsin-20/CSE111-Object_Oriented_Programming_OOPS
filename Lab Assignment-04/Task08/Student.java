package Task08;

public class Student{

	public String name;
	public int id;
	public String dept;
    public String email;
    public String password;
    public String login_status;

	public Student(String n, int i, String d){
		name=n;
		id=i;
		dept=d;
        email=null;
        password=null;
        login_status=null;
		System.out.println("Student object is created");
	}

	public String iden(){
		return String.valueOf(id);
	}
	public String department(){
		return dept;
	}
}
