package Day18.Questions;

public class SpotifyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spotify player = new Spotify();
		
		LoveSongs love = new LoveSongs(player);
		BreakUpSongs breakUp = new BreakUpSongs(player);
		
		love.start();
//		love.join();
		breakUp.start();

	}

}
