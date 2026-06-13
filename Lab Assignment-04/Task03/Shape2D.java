package Task03;

public class Shape2D{

	public String shape;
	public double len;
	public double bred;
	public double hei;
	public double area;

	public Shape2D(){
		shape="Square";
		len=5;
		System.out.println("A Square has been created with length: "+(int)len);
		area=len*len;
	}
	public void area(){

	if(shape.equals("Square")|| shape.equals("Rectangle")){
	   System.out.println("The area of the "+shape+" is: "+ area);
	}
	else{
		if(shape.equals("Triangle") && hei!=0 && bred!=0 && len==0){
			System.out.println("The area of the "+shape+" is: "+ area);
		}
		else{
			System.out.printf("The area of the "+shape+" is: %.2f ",area);
		}
	}
	}

	public Shape2D(double l, double b){
		shape="Rectangle";
		len=l;
		bred=b;
		System.out.println("A Rectangle has been created with length: "+(int)len+" and breadth: "+(int)bred);
		area=len*bred;
	}

	public Shape2D(double h, double b, String n){
		shape=n;
		hei=h;
		bred=b;
		System.out.println("A Triangle has been created with height: "+(int)hei+" and base "+(int)bred);
		area=0.5*bred*hei;
	}

	public Shape2D(double h, double b, double l){
		shape="Triangle";
		hei=h;
		bred=b;
		len=l;
		double s=(hei+bred+len)/2.0;
		System.out.println("A Triangle has been created with the following sides: "+(int)hei+", "+(int)bred+", "+(int)len);
		area=Math.sqrt(s*(s-hei)*(s-bred)*(s-len));
	}
}

