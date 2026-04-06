package com.capg.questions;

import java.util.LinkedList;
import java.util.Scanner;

public class SongTracker {
	static LinkedList<String> playlist = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n-- > 0) {
			String input = sc.nextLine();
			
			String []parts = input.split(" ");
			String cmd = parts[0];
			
			if(cmd.equals("ADD")) {
				addSong(parts[1]);
			}
			else if(cmd.equals("REMOVE")) {
				removeSong(parts[1]);
			}
			else if(cmd.equals("MOVE")) {
				moveToTop(parts[1]);
			}
			else if(cmd.equals("PRINT")) {
				getAllSongs();
			}
		}
	}
	
	public static void addSong(String song) {
		playlist.addLast(song);
	}
	
	public static void removeSong(String song) {
		if(playlist.contains(song)) {
			playlist.remove(song);
		}
	}
	
	public static void moveToTop(String song) {
		if(playlist.contains(song)) {
			playlist.remove(song);
			playlist.addFirst(song);
		}
	}
	
	public static void getAllSongs() {
		if(playlist.isEmpty()){
            System.out.println("EMPTY PLAYLIST");
            return;
        }

        for(String song : playlist){
            System.out.print(song + " ");
        }
        System.out.println();
	}
}
