package Task01;

public class Product{

	private String product;
	private double price;
	private int quantity;

	public Product(){
		product="Unknown";
		price=0.0;
	}

	public Product(String pro, double pri){

		product=pro;
		price=pri;
	}

	public void displayInfo(){
		System.out.println("Product Name: "+product);
		System.out.println("Price: "+price);
	}

	public void setQuantity(int q){
		quantity=q;
	}

	public int getQuantity(){
		return quantity;
	}

	public double getPrice(){
		return price;
	}

	public void displayInfo(boolean bool){
		System.out.println("Product Name: "+product);
		System.out.println("Price: "+price);

		if(bool==true){
			System.out.println("Quantity: "+quantity);
		}
	}
}