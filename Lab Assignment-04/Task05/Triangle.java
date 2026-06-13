package Task05;

public class Triangle{

	public int s1;
	public int s2;
	public int s3;
	public int peri;

	public void updateSides(int a, int b, int c){
		s1=a;
		s2=b;
		s3=c;
		peri=s1+s2+s3;
	}
	public void triangleDetails(){
		System.out.println("Three sides of the triangle are: "+s1+", "+s2+", "+s3);
		System.out.println("Perimeter: "+peri);
	}
	public String printTriangleType(){
		if((s1==s2)&&(s2==s3)){
			return "This is an Equilateral Triangle.";
		}
		else if((s1==s2)||(s2==s3)||(s3==s1)){
			return "This is an Isosceles Triangle.";
		}
		else{
			return "This is a Scalene Triangle.";
		}
	}
	public void compareTrinagles(Triangle com){
		if(this==com){
			System.out.println("These two triangle objects have the same address.");
		}
		else if(s1==com.s1 && s2==com.s2 && s3==com.s3){
			System.out.println("Addresses are different but the sides of the triangles are equal.");
		}
		else if(peri==com.peri){
			System.out.println("Only the perimeter of both triangles is equal.");
		}
		else{
			System.out.println("Addresses, length of the sides and perimeter all are different.");
		}
	}
}