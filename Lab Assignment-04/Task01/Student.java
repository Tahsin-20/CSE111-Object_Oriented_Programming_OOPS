package Task01;

public class Student{

	public String name;
	public String prog;

	public Student(String n, String p){
		name=n;
		prog=p;
	}

	public void updateName(String n){
		name=n;
	}

	public void updateProgram(String p){
		prog=p;
	}

	public String accessProgram(){
		return prog;
	}
}

