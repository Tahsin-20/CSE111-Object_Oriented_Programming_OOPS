package Task04;

public class Circle{

	public static int count;
	private double radius;

	public Circle(int r){
		radius=r;
		count++;
	}

	public double getRadius(){
		return radius;
	}
	
	public double area(){
		double area=Math.PI*radius*radius;
		return area;
	}
}