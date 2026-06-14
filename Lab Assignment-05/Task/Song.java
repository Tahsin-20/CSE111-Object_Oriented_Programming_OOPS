package Task;

//Task-01
public class Song{

	public String title;
	public String artist;
	public int len;
	public Song next_song;

	public Song(String t, String a, int l){
		title=t;
		artist=a;
		len=l;
		next_song=null;
	}

	public void songInfo(){
		System.out.println("Title: "+title);
		System.out.println("Artist: "+artist);
		System.out.println("Length: "+len+" minutes");
	}
}