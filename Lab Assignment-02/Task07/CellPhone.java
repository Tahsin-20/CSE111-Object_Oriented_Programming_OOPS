package Task07;

public class CellPhone{

	public String model="unknown";
	public String [] storeArr=new String[3];
	public int c=0;

	public void printDetails(){
		System.out.println("Phone Model "+model);
		System.out.println("Contacts Stored "+c);

		if(c>0){
			System.out.println("Stored Contacts: ");

			for(int i=0; i<c; i++){
				System.out.println(storeArr[i]);
			}
		}
	}

	public void storeContact(String new_contact){
		if(c<storeArr.length){
			storeArr[c]=new_contact;
			c++;
			System.out.println("Contact Stored");
		}
		else{
			System.out.println("Memory full. New contact can't be stored");
		}
	}
}
