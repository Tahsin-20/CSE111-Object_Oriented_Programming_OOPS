package Task08;

public class Usis{
	public Usis(){
		System.out.println("Usis is ready to use!");
	}
	public String email;
	public String password;
	public String name;
	public String [] course=new String [3];
	public int ind;
	public int n;
	public int id;
	public String dept;
	public boolean bool1=false;
	public boolean bool2=false;
	public boolean bool3=false;

	public void login(Student s){
		if(s.email==null || s.password==null){
			System.out.println("Email and password need to be set.");
		}
		else{
			email=s.email;
			password=s.password;
			name=s.name;
			dept=s.dept;
			id=s.id;
			System.out.println("Login successful");
		}
	}
	public void advising(Student s){
		if(ind==0){
			System.out.println("You haven't selected any courses.");
		}
		else if(bool3==false){
			System.out.println("Please login to advise courses.");
		}
	}
	public void advising(Student s, String a, String b, String c, String d){
		if(ind+4>3){
            System.out.println("You need special approval to take more than 3 courses.");
        }
        else{
            this.course[ind++]=a;
            this.course[ind++]=b;
            this.course[ind++]=c;
            this.course[ind++]=d;
            System.out.println("Advising successful!");
            this.n++;
        }
    }
    public void advising (Student s, String a, String b, String c){
        if(ind+3>3){
            System.out.println("You need special approval to take more than 3 courses.");
        }
        else{
            this.course[ind++]=a;
            this.course[ind++]=b;
            this.course[ind++]=c;
            this.n++;
            System.out.println("Advising successful!");
        }
    }
    public void allAdviseeInfo(){ 
    System.out.println("Total Advisee: "+ n);
    System.out.println("Name: "+ name+ "ID: "+id);
    System.out.println("Department "+ dept);
    System.out.println("Advised Courses are: ");
    for (int i=0; i<ind; i++){
      System.out.print(course[i]+ " ");
    }
    System.out.println();
}
}