package com.company;

import java.util.Scanner;

/**
 * <p>This program is like a library system management. We have albums and novels. Albums have <b> name </b>, <b> number of pages</b>
 * and <b>paper quality </b> and novels have <b> name </b>, <b> number of pages </b> and <b>type</b> (like mister, drama, romance etc). </p>
 * <p> Novels and albums are stored in an <b>arrayList</b>. We can add novels and books to the list, we can print/list them out individually or like total( albums + novels).
 * We can delete from the list a specific novel or album.
 * When we list them we can see all of their properties.</p>
 */
public class Main {


    //This return the sum of albums and novels
    public static int SUMA() {
        return novela.sumaNovel() + album.sumaAlbum();
    }

    // Here we initialize the java Scanner and create our Novel and Album objects to call the built in functions.
    private static Scanner scanner = new Scanner(System.in);
    private static Novel novelList = new Novel("title", 3, "type");
    private static Novel novela = new Novel("title", 3, "type");
    private static Album album = new Album("title", 3, "paperQuality");

    public static void main(String[] args) {

        // This is a switch for whatever the user choose from 0-7 options
        try {
            boolean quit = false;
            int choice = 0;
            printInstruction();
            while (!quit) {
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        printInstruction();
                        break;
                    case 1:
                        novela.listareNovel();
                        break;
                    case 2:
                        album.listareAlbum();
                        break;
                    case 3:
                        novela.addAnovelToList();
                        break;
                    case 4:
                        album.addAnAlbumToList();
                        break;
                    case 6:
                        novela.removeFromNovel();
                        break;
                    case 5:
                        quit = true;
                        break;
                    case 7:
                        System.out.println("Novels + albums: " + SUMA() + ". " + "Including " + novela.sumaNovel() + " novels and " + album.sumaAlbum() + " albums" + ".");
                        break;
                    case 8:
                        album.removeFromAlbum();
                        break;
                    default:
                        System.out.println("Please enter ONLY numbers from 0 to 7");
                        break;
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter only numbers from 0 to 7");
        }
    }

    //print the instructions
    public static void printInstruction() {
        System.out.println("\nPress: ");
        System.out.print("\t 0 - Print choice options.            ");
        System.out.print("\t 1 - Print the list of the novel items         ");
        System.out.println("\t 2 - Print the list of the album items         ");
        System.out.print("\t 3 - Add a novel to the list         ");
        System.out.print("\t 4 - Add a album to the list                   ");
        System.out.println("\t 5 - Quit the aplication");
        System.out.print("\t 6 - Delete a novel from list         ");
        System.out.println("\t 7 - Print novels + albums ");
        System.out.println("\t 8 - Delete an album from list");

    }
}







