import java.util.Scanner;
import java.util.Arrays;

public class Task08{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("row=");
		int row=sc.nextInt();
		System.out.print("column=");
		int col=sc.nextInt();

		int [][] arr=new int[row][col];

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("2D Array:");

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int [] new_arr=new int[row*col];
		int ind=0;

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				new_arr[ind]=arr[i][j];
				ind++;
			}
		}
		System.out.println("1D Array:");
		System.out.println(Arrays.toString(new_arr));

		sc.close();
	}
}