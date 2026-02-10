package Day18.Questions;

public class Spotify {
	
	synchronized void playList(String type , String[] songs) {
		System.out.println("\n=== " + type + " Playlist Started ===");
		
		for(int i=0 ; i<songs.length ; i++) {
			System.out.println((i + 1) + " -> " + songs[i]);
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println("\n=== " + type + " Playlist Ended ===");
	}
	
}
