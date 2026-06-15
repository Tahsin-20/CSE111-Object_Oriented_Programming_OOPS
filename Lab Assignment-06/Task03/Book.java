package Task03;

public class Book{

   public static int total_books_sold;
   public static double total_revenue;
   public String title;
   public int disc;
   public int price=150;
   public double price_after_discount;

   public Book(String b, int d){
      title=b;
      disc=d;
      total_books_sold++;
   }

   public double discount_price(){
      price_after_discount=price-((price)*(disc/100.0));
      total_revenue+=price_after_discount;
      return price_after_discount;
   }

   public void bookDetails(){
      System.out.println("Title: "+title);
      System.out.println("Price after Discount: "+discount_price());
   }
}
