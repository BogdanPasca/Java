package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Novel {
    private ArrayList<Novel> novelArrayList = new ArrayList<Novel>();
    private String title;
    private int pageNumbers;
    private String type;

    //The constructor for class and the getters.
    public Novel(String title, int pageNumbers, String type) {
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public String getType() {
        return type;
    }

    //This is a method that add a novel to the list
    public void addAnovelToList() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number of novels you wish to add:   ");
            int numberOfNovels = scanner.nextInt();
            scanner.nextLine();

            //This is a system out print that underline keywords for the UI.
            System.out.println((char) 27 + "[4mTILE," + (char) 27 + "[0m " + (char) 27 + "[4mPAGE NUMBER" + (char) 27 +
                    "[0m and " + (char) 27 + "[4mTYPE" + (char) 27 + "[0m of added Novel (each on single line) :");

            for (int i = 0; i < numberOfNovels; i++) {
                String title = scanner.nextLine();
                int pageNumbers = scanner.nextInt();
                scanner.nextLine();
                String type = scanner.nextLine();
                novelArrayList.add(new Novel(title, pageNumbers, type));
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter only NUMBERS for NUMBER OF NOVELS and for PAGE NUMBER");
        }
    }

    //this is a method that returns the total number of novels from the list
    public int sumaNovel() {
        return novelArrayList.size();
    }

    //this is a method that returns all the novels from the list with all of their properties.
    public void listareNovel() {
        System.out.println("Total number of novels: " + novelArrayList.size());
        for (int i = 0; i < novelArrayList.size(); i++) {
            System.out.println((i + 1) + ". " + novelArrayList.get(i));
        }
    }

    //this is a method that delete a specific novel from the list by novel name;
    public void removeFromNovel() {
        boolean flag = true;

        if ((novelArrayList.size()) > 0 && (flag = true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("NAME of the novel you want to delete: ");
            String nme = scanner.nextLine();
            Iterator<Novel> it = novelArrayList.iterator();

            while (it.hasNext()) {
                if (((it.next().getTitle().equals(nme)))) {
                    it.remove();
                    System.out.println("Novel deleted");
                }
            }
        } else if (novelArrayList.size() == 0 || !flag) {
            System.out.println("Novel list is empty!");
        }
    }

    @Override
    public String toString() {
        return title + " has " + pageNumbers + " pages and " + type + " type.";
    }
}



