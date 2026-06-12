package Task01;

public class BankAccount{

  public int accntNo;
  public String accntType="Not Set";

  public void setInfo(int n, String type){
    this.accntNo=n;
    this.accntType=type;
    System.out.println("Account information updated!");
  }

  public String printDetails(){
    System.out.println("Account No: "+accntNo);
    return "Type: "+accntType;
  }
}

