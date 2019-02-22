package com.sammyyy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    public Song findSong(String title){

        for(int i = 0; i < songs.size(); i++){

            if(songs.get(i).equals(title)){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playList){
        Song song = findSong(songName);

        if(song != null){
            playList.add(song);
            return true;
        }
        System.out.println("This song does not available in this album.");
        return false;



    }
}
