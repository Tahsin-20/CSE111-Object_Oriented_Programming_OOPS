package Task02;

public class Toy{
    String name;
    int p;
    public Toy(String a, int b){
        name=a;
        p=b;
        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int up){
        p=up;
    }

    public void showPrice(){
        System.out.println("Price: "+p+" Taka");
    }
    public void updateName(String new_name){
        System.out.println("Changing old name: "+name);
        name=new_name;
        System.out.println("new name: "+name);
    }
}
