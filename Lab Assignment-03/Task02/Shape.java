package Task02;

public class Shape{

  public String name;
  public double area;

  public void setParameters(String shape, int r){
    this.name="Circle";
    this.area=3.1416*r*r;
  }
  public void setParameters(String shape, int b, int h){
    this.name="Triangle";
    this.area=1/2.0*b*h;
  }
  public void setParameters(String shape, double b, double l){
    this.name="Rectangle";
    this.area=l*b;
  }
  public String details(){
    System.out.println("Shape Name: "+name);
    return "Area: "+area;
  }
}
