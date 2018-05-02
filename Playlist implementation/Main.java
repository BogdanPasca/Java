package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love dont't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 4.25);
        album.addSong("Lady double dealer", 4.12);
        album.addSong("You can do it right", 3.6);
        album.addSong("High ball shooter", 3.61);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 4.59);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("I put the finger on you ", 3.25);
        album.addSong("Let`s go", 5.44);
        album.addSong("Inject the venom", 3.44);
        album.addSong("Snowballed", 5.34);
        album.addSong("Evil walks", 4.44);
        album.addSong("C.O.D.", 6.44);
        album.addSong("Breaking the rules", 3.23);
        album.addSong("Night of the long knives", 5.44);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);

        play(playList);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean fordward = true;


        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!fordward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        fordward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        fordward = false;
                    }
                    break;
                case 2:
                    if (fordward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        fordward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        fordward = true;
                    }

                    break;
                case 3:
                    if (fordward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing: " + listIterator.previous().toString());
                            fordward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying: " + listIterator.next().toString());
                            fordward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress:");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print available acions.");
        System.out.println("6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("#################################");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("#################################");
    }
}












