package com.sammyyy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> album = new ArrayList<Album>();

    public static void main(String[] args) {





    }
    public static void play(LinkedList<Song> playList){
        boolean quit = false;
        boolean isForward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("There isn't any songs in playlist!");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
        }
        actions();
        while(!quit){

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("Playlist has been completed.\nBye Bye ^_^");
                    quit = true;
                    break;
                case 1:

                    if(!isForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        isForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next().toString());
                    }else{
                        System.out.println("End of the playlist!");
                        isForward = false;
                    }
                    break;
                case 2:
                    if(isForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());

                    }else{
                        System.out.println("We are at the start of the list!");
                        isForward = true;
                    }
                    break;
            }


        }


    }


    public static void actions() {
        System.out.println("Actions:\npress;\n" +
                "0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - to list songs in the playlist\n" +
                "5 - to print actions.\n" +
                "6 - to delete current song from playlist\n"+
                "_________________________________________");
    }



}
