package Day18.Questions;

public class BreakUpSongs extends Thread {
	private final Spotify player;
	
	public BreakUpSongs(Spotify player) {
		this.player= player;	
	}
	
	@Override
	public void run() {
		String[] songs = {
				"1. Agar Tum Saath Ho - Arijit Singh & Alka Yagnik",
				"2. Pachtaoge - Arijit Singh",
				"3. Saiyaara - Faheem Abdullah"
		};
		
		player.playList("Top 3 Hindi BreakUp Songs" , songs);
	}
}
