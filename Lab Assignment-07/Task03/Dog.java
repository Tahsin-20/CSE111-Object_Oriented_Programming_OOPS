package Task03;

public class Dog extends Animal{

	public String type;

	public Dog(String n, int a, String c, String t){
		super(n, a, c);
		type=t;
	}

	@Override
	public void makeSound(){
		System.out.println(color+" color "+name+" is barking");
	}

	@Override
	public String info(){
		return super.info()+"Breed: "+type+"\n";
	}
}