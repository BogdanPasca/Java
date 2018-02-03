package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Album {
    private ArrayList<Album> albumArrayList = new ArrayList<Album>();
    private String title;
    private int pageNumbers;
    private String paperQuality;

    //The constructor for class and the getters.
    public Album(String title, int pageNumbers, String paperQuality) {
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.paperQuality = paperQuality;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    //This is a method that add an album to the list
    public void addAnAlbumToList() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number of albums you wish to add:   ");
            int numberOfAlbums = scanner.nextInt();
            scanner.nextLine();

            //This is a system out print that underline keywords for the UI.
            System.out.println((char) 27 + "[4mTILE," + (char) 27 + "[0m " + (char) 27 + "[4mPAGE NUMBER" + (char) 27 +
                    "[0m and " + (char) 27 + "[4mPAPER QUALITY" + (char) 27 + "[0m of added Album (each on single line) :   ");

            for (int i = 0; i < numberOfAlbums; i++) {
                String title = scanner.nextLine();
                int pageNumbers = scanner.nextInt();
                scanner.nextLine();
                String paperQuality = scanner.nextLine();
                albumArrayList.add(new Album(title, pageNumbers, paperQuality));
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("\"Enter only NUMBERS for NUMBER OF ALBUMS and for PAGE NUMBER\"");
        }
    }

    //this is a method that returns the total number of albums from the list
    public int sumaAlbum() {
        return albumArrayList.size();
    }

    //this is a method that returns all the albums from the list with all of their properties.
    public void listareAlbum() {
        System.out.println("Total number of albums: " + albumArrayList.size());
        for (int i = 0; i < albumArrayList.size(); i++) {
            System.out.println((i + 1) + "." + albumArrayList.get(i));
        }
    }

    //this is a method that delete a specific album from the list by album name;
    public void removeFromAlbum() {
        boolean flag = true;

        if ((albumArrayList.size()) > 0 && (flag = true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("NAME of the album you want to delete: ");
            String nme = scanner.nextLine();
            Iterator<Album> it = albumArrayList.iterator();

            while (it.hasNext()) {
                if (((it.next().getTitle().equals(nme)))) {
                    it.remove();
                    System.out.println("Album deleted");
                }
            }

        } else if (albumArrayList.size() == 0 || !flag) {
            System.out.println("Album list is empty!");
        }
    }

    @Override
    public String toString() {
        return title + " has " + pageNumbers + " pages " + "and " + paperQuality + " paper quality.";
    }
}

