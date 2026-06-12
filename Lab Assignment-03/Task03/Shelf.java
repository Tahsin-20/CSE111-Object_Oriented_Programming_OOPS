package Task03;

public class Shelf{

  public int capacity;
  public int numBooks;

  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity);
    System.out.println("Number of books: "+numBooks);
  }

  public void addBooks(int books){

    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if(capacity<numBooks+books){
      System.out.println("Exceeds capacity");
    }
    else{
      numBooks+=books;
      System.out.println(books+" books added to shelf");
    }
  }
}
