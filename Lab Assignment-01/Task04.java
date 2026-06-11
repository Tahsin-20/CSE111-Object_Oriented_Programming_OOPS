import java.util.Scanner;

public class Task04{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String c="";

		for(int i=0; i<str.length(); i++){

			char word=str.charAt(i);

			if(word!='a'){
				c+=(char)((int)(word-1));
			}
			else{
				c+='z';
			}
		}
		System.out.println(c);

		sc.close();
	}
}