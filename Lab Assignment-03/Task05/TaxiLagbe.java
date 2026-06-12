package Task05;

public class TaxiLagbe{

  public String num;
  public String location;
  public int pass_count;
  public int totalFare;
  public String[]passList=new String[4];

  public void printDetails(){

    System.out.println("Taxi number: "+num);
    System.out.println("This taxi can cover "+location+" area");
    System.out.println("Total Passenger: "+pass_count);
    System.out.println("Passenger Lists:");

    if(pass_count>0){
      for(int i=0; i<pass_count; i++){
        System.out.print(passList[i]+" ");
      }
    }
    System.out.println();
    System.out.println("Total collected fare: "+totalFare+" Taka");
  }
  public void storeInfo(String no, String area){
    this.num=no;
    this.location=area;
  }
  public void addPassenger(String n, int f){
    if(passList.length>pass_count){
      passList[pass_count]=n;
      pass_count++;
      totalFare+=f;
      System.out.println("Dear "+n+"! Welcome to TaxiLagbe");
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
  public void addPassenger(String n1, int f1, String n2, int f2){
    addPassenger(n1, f1);
    addPassenger(n2, f2);
  }
}
