import java.util.Scanner;

public class Task03{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int value=0;

		String first=sc.nextLine();
		String second=sc.nextLine();
		String full= first+" "+second;

		for(int i=0; i<full.length(); i++){

			char word=full.charAt(i);
			
			if((word>='a' && word<='z') || (word>='A' && word<='Z')){
				value+=(int)(word);
			}
		}

		System.out.println(full);
		System.out.println(value);

		sc.close();
	}
}