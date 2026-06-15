package Task08;

public class Player{

	public static int total;
	public static String[]arr=new String[11];

	public String name;
	public int jersey_no;
	public String country;

	public Player(String p, String c, int n){
		name=p;
		jersey_no=n;
		country=c;

		if(total<11){
			arr[total]=p;
			total++;
		}
	}

	public String player_detail(){
		return "Player Name: "+name+"\n"+"Jersey Number: "+jersey_no+"\n"+"Country: "+country;
	}

	public static void info(){
		System.out.println("Total number of players: "+total);
		System.out.print("Player enlisted so far: ");

		for(int i=0; i<total; i++){
			System.out.print(arr[i]);
			
			if(i<total-1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}