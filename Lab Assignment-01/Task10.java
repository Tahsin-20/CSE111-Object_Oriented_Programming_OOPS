import java.util.Scanner;

public class Task10{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int [][] map = {{0, 0, 10, 0, -1},
                        {0, -1, 0, 0, -1},
                        {-1, 0, -1, 0, 0},
                        {0, -1, 7, 0, -1},
                        {0, -1, 0, -1, 0}
        };
        System.out.println("Initial Map:");

        for(int i=0; i<map.length; i++){
        	for(int j=0; j<map[0].length; j++){
        		System.out.print(map[i][j]+" ");
        	}
        	System.out.println();
        }
        int r_pos=3;
        int c_pos=2;

        int moves=5;
        while(moves>0){
        	int new_r=r_pos;
        	int new_c=c_pos;

        	System.out.printf("Enter move %d: ",(6-moves));

        	String comm=sc.nextLine();

        	if(comm.equals("RIGHT")){
        		new_c+=1;
        	}
        	else if(comm.equals("LEFT")){
        		new_c-=1;
        	}
        	else if(comm.equals("UP")){
        		new_r-=1;
        	}
        	else if(comm.equals("DOWN")){
        		new_r+=1;
        	}

        	if(new_c<0 || new_c<0 || new_r>=map.length || new_c>=map[0].length){
        		System.out.println("Player fell outside the playing area. Game over!");
        		break;
        	}
        	if(map[new_r][new_c]==-1){
        		System.out.println("Player stepped on mine. Game Over!");
        		break;
        	}
        	else if(map[new_r][new_c]==10){
        		System.out.println("Treasure found. You win!");
        		break;
        	}
        	else{
        		map[r_pos][c_pos]=0;
        		r_pos=new_r;
        		c_pos=new_c;
        		map[r_pos][c_pos]=7;

        		System.out.println("Current State:");

        		for(int i=0; i<map.length; i++){
        			for(int j=0; j<map[0].length; j++){
        				System.out.print(map[i][j]+" ");
        			}
        			System.out.println();
        		}
        	}
        	moves--;
        }
        if(moves==0){
        	System.out.println("Failed to find the treasure.");
        }

        sc.close();
	}
}