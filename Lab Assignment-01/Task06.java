import java.util.Scanner;

public class Task06{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();

		int [] arr=new int [len];
		boolean [] bool=new boolean [len];

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){
			int count=1;
			for(int j=i+1; j<arr.length; j++){

				if(arr[i]==arr[j]){
					count++;
					bool[j]=true;
				}
			}
			if(bool[i]==false){
				System.out.println(arr[i]+"-"+count+" times");
			}
		}
		sc.close();
	}
}