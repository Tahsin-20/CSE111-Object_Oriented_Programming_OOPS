import java.util.Scanner;

public class Task09{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		int [][] mat=new int[x][x];

		for(int i=0; i<x; i++){
			for(int j=0; j<x; j++){
				mat[i][j]=sc.nextInt();
			}
		}
		boolean bool=true;

		for(int i=0; i<x; i++){
			for(int j=0; j<x; j++){
				if((i==j && mat[i][j]!=1) || (i!=j && mat[i][j]!=0)){
					bool=false;
					break;
				}
			}
		}
		if(bool==false){
			System.out.println("Not an Identity Matrix");
		}
		else{
			System.out.println("Identity Matrix");
		}

		sc.close();
	}
}