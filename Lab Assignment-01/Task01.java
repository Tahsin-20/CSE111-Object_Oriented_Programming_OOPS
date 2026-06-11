import java.util.Scanner;

public class Task01{
	public static void main(String[]args){

		int min_val=Integer.MAX_VALUE;
		int max_val=Integer.MIN_VALUE;
		int sum=0;
		int count=0;

		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=10; i++){

			int num=sc.nextInt();

			if(num>0 && num%2!=0){

				sum+=num;
				count++;

				if(num>max_val){
					max_val=num;
				}
				if(num<min_val){
					min_val=num;
				}
			}
		}

		if(count>0){
			double avg=sum/count;

			System.out.println("Sum="+sum);
			System.out.println("Minimum="+min_val);
			System.out.println("Maximum="+max_val);
			System.out.println("Average="+avg);
		}
		else{
			System.out.println("No odd positive numbers found");
		}

		sc.close();
	}
}