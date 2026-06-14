package Task;

//Task-02
public class Playlist{

	public String name;
	public String playlist_no;
	public int c;
	public Song start;

	public Playlist(String a){
		playlist_no=a;
		name=a;
		System.out.println(a+" created.");

	}
//Task-03_04
    public void addSong(Song sg){

		if(start==null){
			start=sg;
		}
		else{
			Song current=start;
			while(current.next_song!=null){
				current=current.next_song;
			}
			current.next_song=sg;
		}
		System.out.println(sg.title+" added to "+playlist_no+".");
	}

	public void info(){
		System.out.println(playlist_no+" has the following songs:");

		if(start==null){
			System.out.println("No songs in "+playlist_no+".");
		}
		else{
			Song current=start;
			c=1;
			while(current!=null){
				System.out.println("Song-"+c++);
				current.songInfo();
				current=current.next_song;
			}

		}
	}

// Task-05
    public void addSong(Song sg, int i){

		if(i>9){
			System.out.println("Cannot add song to Index "+i+".");
			return;
		}
		if(i==0){
			sg.next_song=start;
			start=sg;
			System.out.println(sg.title+" added to "+playlist_no);
			return;
		}
		Song current=start;

		for(int j=0; j<i-1; j++){
		    current=current.next_song;
	    }
	        sg.next_song=current.next_song;
		    current.next_song=sg;
		    System.out.println(sg.title+" added to "+playlist_no);
	}

//Task-06
    public void playSong(String s){
		Song current=start;
		while(current!=null){
			if(current.title.equals(s)){
				System.out.println("Playing "+s+" by artist "+current.artist);
				return;
			}
			current=current.next_song;
		}
		System.out.println(s+" not find in the playlist "+playlist_no);
	}

//Task-07
    public void playSong(int i){
		Song current=start;
		int c=0;
		while(current!=null){
			if(c==i){
			System.out.println("Playing "+current.title+" by "+current.artist+" .");
			return;
		    }
		    current=current.next_song;
		    c++;
		}
		System.out.println("song at Index "+i+" no found in "+playlist_no);
	}

//Task-08
    public void deleteSong(String s){

		if(start==null){
			System.out.println(s+" not found in "+playlist_no);
			return;
		}
		if(start.title.equals(s)){
			start=start.next_song;
			System.out.println(s+" deleted from "+playlist_no);
			return;
		}
		Song current=start;
		Song d=null;
		while(current!=null){
			if(current.title.equals(s)){
				System.out.println(s+" deleted from "+playlist_no);
				d.next_song=current.next_song;
				return;
			}
			    d=current;;
				current= current.next_song;
		}
    	System.out.println(s+" not found in "+playlist_no);
	}

//Task-09
    public int totalSong(){
		int c=0;
		Song current=start;
		while(current!=null){
			c++;
			current=current.next_song;
		}
		return c;
	}

//Task-10
    public void merge(Playlist play){

		if(start==null){
			start=play.start;
		}
		else{
			Song current=start;
			while(current.next_song!=null){
				current=current.next_song;
			}
			current.next_song=play.start;
		}
		System.out.println("Merge Completed!");
    }
}