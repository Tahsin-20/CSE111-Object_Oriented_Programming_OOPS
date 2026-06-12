package Task04;

public class Library{

  public int max_cap;
  public int books;
  public String [] list;

  public void setBookCapacity(int cap){
    max_cap=cap;
    list=new String [max_cap];
  }

  public void addBook(String book){

    if(books>=max_cap){
      System.out.println("Maximum capacity exceeds. You can't add more than "+max_cap+" books");
    }
    else{
      list[books]=book;
      books++;
      System.out.println("Book '"+book+"' added to the library");
    }
  }

  public void printDetail(){
    System.out.println("Maximum capacity: "+max_cap);
    System.out.println("Total Books: "+books);
    System.out.println("Book list: ");

      for(int i=0; i<books; i++){
        System.out.println(list[i]);
      }
  }
}