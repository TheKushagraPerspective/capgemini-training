package Day18.Questions;

public class LoveSongs extends Thread{
	private final Spotify player;
		
	public LoveSongs(Spotify player) {
		this.player= player;	
	}
	
	@Override
	public void run() {
		String[] songs = {
				"1. Chaand Sifarish - Shaan, kailash Kher",
				"2. Phir Bhi Tumko Chaahunga - Arijit Singh",
				"3. Duniyaa - Akhil & Dhvanji Bhanushali"
		};
		
		player.playList("Top 3 Hindi Love Songs" , songs);
	}
}
