import java.util.Scanner;

public class Task07{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("N=");
		int len=sc.nextInt();

		double [] arr=new double[len];

		System.out.println("Please enter the elements of the array:");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextDouble();
		}
		double [] new_arr=new double [len];
		int ind=0;

		for(int i=0; i<arr.length; i++){
			if(i==0 || arr[i]!=arr[i-1]){
				new_arr[ind]=arr[i];
				ind++;
			}
		}
		int removed=0;
		for(int i=0; i<new_arr.length; i++){
			if(new_arr[i]==0){
				removed+=1;
			}
		}
		System.out.print("New Array: ");
		for(int i=0; i<ind; i++){
			System.out.print(new_arr[i]+" ");
		}
		System.out.println();
		System.out.println("Removed elements: "+removed);

		sc.close();
	}
}