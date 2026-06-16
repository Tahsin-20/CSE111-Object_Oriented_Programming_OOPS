package Task03;

public class Cat extends Animal{

	public String type;

	public Cat(String n, int a, String c, String t){
		super(n, a, c);
		type=t;
	}

	@Override
	public void makeSound(){
		System.out.println(color+" color "+name+" is meowing");
	}

	@Override
	public String info(){
		return super.info()+"Breed: "+type+"\n";
	}
}