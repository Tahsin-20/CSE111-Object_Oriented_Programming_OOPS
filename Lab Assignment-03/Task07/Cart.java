package Task07;

public class Cart{

  public int cart_no;
  public int item;
  public double dis;
  public double total;
  public String[]items=new String[3];
  public double[]price=new double[3];

  public void create_cart(int n){
    this.cart_no=n;
  }

  public void addItem( String i, double p){

    if(item<items.length){

      items[item]=i;
      price[item]=p;
      item++;
      total+=p;
      System.out.println(i+" added to "+this.cart_no+".");
      System.out.println("You have "+item+" item(s) in your cart now.");
    }

    else{
      System.out.println("You already have "+item+" items on your cart");
    }
  }

  public void addItem(double p, String i){

      if(item<items.length){

      items[item]=i;
      price[item]=p;
      item++;
      total+=p;
      System.out.println(i+" added to "+this.cart_no+".");
      System.out.println("You have "+item+" item(s) in your cart now.");
    }

    else{
      System.out.println("You already have "+item+" items on your cart");
    } 
  }

  public void giveDiscount(int d){
    this.dis=d;
    double discount=(d/100.0)*total;
    this.total=total-discount;
  }

  public void cartDetails(){

    System.out.println("Your cart(c"+cart_no+") :");
    for(int i=0; i<item; i++){
      System.out.println(items[i]+" - "+ price[i]);
    }
    System.out.println("Discount Applied: "+dis+"%");
    System.out.println("Total price: "+total);
  }

}