package Task07;

public class BracuBus{

	public String area;
	public int max;;
	public String [] p;
	public int ind=0;

	public BracuBus(String a){
		area=a;
		max=2;
		p=new String[max];
	}
	public BracuBus(String a, int stu){
		area=a;
		max=stu;
		p=new String[max];
	}
	public void board(){
		if(ind==0){
			System.out.println("No passengers");
		}
	}

	public void board(BracuStudent[]stu){
        for(int i=0; i<stu.length; i++){
            BracuStudent student= stu[i];
          if(ind>= max){
            System.out.println("Bus is full!");
          return;
          }

          if(!student.pass()){
            System.out.println("You don't have a bus pass!");
          }

          if(!student.home().equals(area)){
            System.out.println("You got on the wrong bus!");
          }

          p[ind++]=student.name();
          System.out.println(student.name()+ " boarded the  bus.");
        }
    }
    public void showDetails(){
          System.out.println("Buss Route: "+ area);
          System.out.println("Passenger Count: "+ind+ " (Max: "+max+ ")");
          System.out.println("Passengers on Board: ");

          if(ind==0){
            System.out.println();
          }

          else{
            for(int i=0; i<ind; i++){
              System.out.print(p[i]+ " ");
            }
          System.out.println();
          }
    }

    public void board(BracuStudent st1){
        board(new BracuStudent[]{st1});
    }
    
    public void board(BracuStudent st1, BracuStudent st2){
        board(new BracuStudent[]{st1, st2});
    }
}

