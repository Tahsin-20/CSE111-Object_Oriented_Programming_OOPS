package Task08;

public class Reader{

  public String name="New User";
  public int cap=0;
  public int count;
  public String [] list;

  public String createReader(String n, int c){
    this.name=n;
    this.cap=c;
    this.list=new String[cap];

    return "A new reader is created!";
  }

  public void addBook(String b){

    if(count<cap){
      list[count]=b;
      count++;
    }
    else{
      System.out.println("No more capacity");
    }
  }

  public void readerInfo(){

    System.out.println("Name: "+name);
    System.out.println("Capacity: "+cap);
    System.out.println("Books:");

    if(count==0){
      System.out.println("No books added yet");
    }
    else{
      int j=1;
      for(int i=0; i<count; i++){
        System.out.println("Book "+j+": "+list[i]);
        j++;
      }
    }
  }
}
