package Task05;

public class Borrower{

	public static int[]book_count={3, 3, 3};
	public static String[]book_name={"Pather Panchali", "Durgesh Nandini", "Anandmath"};

	public String name;
	public String[]b_books=new String[3];
	public int count;

	public Borrower(String n){
		name=n;
	}

	public void borrowBook(String b){

		for(int i=0; i<book_name.length; i++){
			if(book_name[i].equals(b)){
				if(book_count[i]>0){
					b_books[count]=b;
					count++;
					book_count[i]--;
				}
				else{
					System.out.println("This book is not available.");
				}
			}
		}
	}

	public void borrowerDetails(){
		System.out.println("Name: "+name);
		System.out.println("Books Borrowed: ");

		for(int i=0; i<count; i++){
			System.out.println(b_books[i]);
		}
	}

	public static int remainingBooks(String b){

		for(int i=0; i<book_name.length; i++){
			if(book_name[i].equals(b)){
				return book_count[i];
			}
		}
		return 0;
	}

	public static void bookStatus(){

		System.out.println("Available Books: ");

		for(int i=0; i<book_name.length; i++){
			System.out.println(book_name[i]+": "+book_count[i]);
		}
	}
}
