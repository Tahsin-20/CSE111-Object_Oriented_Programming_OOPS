package Task07;

public class CinemexTicket extends MovieTicket{

	public static int count;
	public String genre;
	public String type;
	public boolean bool;

	public CinemexTicket(String m, String t, String g, String d){
		super(m, d, t, 0.0);
		genre=g;
		type="Regular";
		bool=false;
		count++;
	}

	public CinemexTicket(String m, String t, String g, String d, String tic){
		super(m, d, t, 0.0);
		genre=g;
		type=tic;
		bool=false;
		count++;
	}

	public void calculateTicketPrice(){

		int seat_no=-69;

		for(int i=0; i<seatTypes.length; i++){

			if(seatTypes[i].equals(type)){
				seat_no=i;
				break;
			}
		}

		if(seat_no>=0){
			setPrice(seatPrices[seat_no]);
		}

		String a=showtime.split(":")[0];
		int h=Integer.parseInt(a);

		if(h>=18 && h<=23){

		double night=getPrice()*(nightShowCharge/100.0);
		setPrice(getPrice()+night);	
		}

		System.out.println("Ticket price is calculated successfully.");
	}

	public String generateTicketID(){
		char wd=type.charAt(0);
		return getMovie()+"-"+wd+"-"+count;
	}

	public String confirmPayment(){

		if(bool==false){
			bool=true;
			return "Payment Successful.";
		}
		else{
			return "Ticket price is already paid!";
		}
	}

	public static int getTotalTickets(){
		return count;
	}

	public String toString(){
        String r="Ticket ID: "+generateTicketID()+"\n"+"Movie: "+getMovie()+"\n"+"Showtime: "+showtime+"\n"+"Date: "+date+"\n"+"Genre: "+genre+"\n"+"Seat Type: "+type+"\n"+"Price(tk): "+getPrice()+"\n";
                
                if(bool==true){
                	r+="Status: Paid";
                }
                else{
                	r+="Status: Not Paid";
                }
                return r;
	}
}