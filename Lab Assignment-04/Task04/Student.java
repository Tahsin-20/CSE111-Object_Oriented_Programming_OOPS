package Task04;

public class Student{

	public int id;
	public double cg;
	public String[]arr1=new String[4];
	public int c1;

	public Student(int i){
		id=i;
		System.out.println("A student with ID "+id+" has been created.");
	}
	public void addCourse(String c) {
        if(cg==0.0){
            System.out.println("Failed to add " + c);
            System.out.println("Set CG first");
        }
        else if (cg<3.0){
            if(c1<3) {
                arr1[c1]=c;
                c1++;
            } 
            else {
                System.out.println("Failed to add " + c);
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
        } 
        else {
            if(c1<4) {
                arr1[c1]=c;
                c1++;
            } 
            else {
                System.out.println("Failed to add " + c);
                System.out.println("Maximum 4 courses allowed.");
            }
        }
    }
	public void storeCG(double cgpa){
		cg=cgpa;
	}
	public void showAdvisee(){
		System.out.println("Student ID: "+id+", "+"CGPA: "+cg);
		if(c1==0){
			System.out.println("No courses added.");
		}
		else{
			System.out.println("Added courses are: ");
			for(int i=0; i<c1; i++){
				System.out.print(arr1[i]+" ");
			}
			System.out.println();
		}
	}
	public void removeAllCourse(){
		arr1=new String[4];
		c1=0;
	}
	public void storeID(int i){
		id=i;
	}
	public Student(int i, double c){
		id=i;
		cg=c;
		System.out.println("A student with ID "+id+" has been created cgpa "+cg+" has been created.");
	}
	public void addCourse(String[]course){
		for(int i=0; i<course.length; i++){
			addCourse(course[i]);
		}
	}
}

