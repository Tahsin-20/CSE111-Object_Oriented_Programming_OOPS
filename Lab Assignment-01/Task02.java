import java.util.Scanner;

public class Task02{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int stop=sc.nextInt();

		int prime=0;

		for(int i=start; i<=stop; i++){

			int count=0;

			for(int j=1; j<=i; j++){

				if(i%j==0){
					count++;
				}
			}
			    if(count==2){
					prime++;
				}
		}
		System.out.println("There are "+prime+" prime numbers between "+start+" and "+stop);

		sc.close();
	}
}