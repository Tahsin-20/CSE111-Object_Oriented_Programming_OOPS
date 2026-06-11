import java.util.Scanner;
import java.util.Arrays;

public class Task05{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int len=sc.nextInt();

		int [] arr= new int[len];

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		int start=0;
		int end=arr.length-1;
		
		for(int i=0; i<arr.length/2; i++){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}