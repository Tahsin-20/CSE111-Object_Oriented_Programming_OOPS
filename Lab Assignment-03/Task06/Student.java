package Task06;

public class Student{

  public String name="Not Set";
  public String dept="CSE";
  public double cgpa= 0.0;
  public int cred=9;
  public String ss="Not Set";

  public void showDetails(){

    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Credits: "+cred);
    System.out.println("Scholarship Status: "+ss);
  }

  public void updateDetails( String n, double cg, int c){
    this.name=n;
    this.cgpa=cg;
    this.cred=c;
  }

  public void updateDetails( String n, double cg){
    this.name=n;
    this.cgpa=cg;
  }

  public void updateDetails(String n, double cg, int cred, String d){
    updateDetails(n, cg, cred);
    this.dept=d;
  }

  public void checkScholarshipEligibility(){

    if(cgpa>=3.5 && cred>10){

      if(cgpa>=3.5 && cgpa<3.7){
        System.out.println(name+" is eligible for Need based scholarship");
        ss="Need based scholarship";
      }
      else{
        System.out.println(name+" is eligible for Merit based scholarship");
        ss="Merit based scholarship";
      }
    }

    else{
      System.out.println(name+" is not eligible for scholarship");
      ss="No scholarship";
    }
  }
}
