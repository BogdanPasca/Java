package com.company;


import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    //Adresa catre fisierul initial cu sportivi!!!
    private static final String FILENAME = "C:\\Users\\Dumnezeu\\Desktop\\sportivi.txt";

    public static void main(String[] args) {
        //Se creeaza o lista care va curpinde toti atletii din fisier
        List<Athlete> allAthleteList = new ArrayList<>();
        //Se citeste din fisierul CSV, se face split dupa "," . Se obtine fiecare propr a atletului dupa care se adauga in lista

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                String[] splitted = currentLine.split(",");
                Athlete splitAthleteList = new Athlete();
                splitAthleteList.setAthleteNumber(splitted[0]);
                splitAthleteList.setAthleteName(splitted[1]);
                splitAthleteList.setCountryCode(splitted[2]);

                transformareMminSecunde(splitAthleteList.setSkiTimeResul(splitted[3]));

                int timpInitialInsecunde = transformareMminSecunde(splitAthleteList.setSkiTimeResul(splitted[3]));

                splitAthleteList.setFirstShootingRange(splitted[4]);
                splitAthleteList.setSecondShootingRange(splitted[5]);
                splitAthleteList.setThirdShootingRange(splitted[6]);
                allAthleteList.add(splitAthleteList);

                String rezultatTrageri = splitted[4] + splitted[5] + splitted[6];

                int penalizareSecunde = secundePenalizare(rezultatTrageri);
                System.out.println("--");
                int timpFinalInSecunde = timpInitialInsecunde + penalizareSecunde;

                String timpFinalCuPenalizari = timeConverter(timpFinalInSecunde);
                System.out.println(splitted[1] + ": timp initial FARA penalizari: " + splitAthleteList.setSkiTimeResul(splitted[3]));

                System.out.println("Rezultate tras la tinta: " + splitted[4] + " " + splitted[5] + " " + splitted[6] +
                        " ---> " + penalizareSecunde + " SECUNDE penalizare");
                System.out.println("Timp FINAL CU penalizari: " + timpFinalCuPenalizari);
                splitted[3] = timpFinalCuPenalizari;                                                                         //asta e timp initial = timp final;

                // aici incerc sa fac atribuirea timpul initial cu cel final!!!!!!!!!!!!!!!!!!!!!
                String timpInitial = splitAthleteList.setSkiTimeResul(splitted[3]);
                String timpFinal = timpFinalCuPenalizari;

                //---------------------------
            }
            System.out.println(" ");
            System.out.println("======== Noua lista cu toti atletii din sportivi.txt CU PENALIZARI la timp ========  \n" + allAthleteList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        System.out.println("******************************************--*****************************************");

        Set<Athlete> timpCompp = new TreeSet<Athlete>(new TimeComp());
        timpCompp.addAll(allAthleteList);

        System.out.println("========== sortare dupa TIMPUL FINAL cu PENALIZARI! ========== ");
        //for (Athlete e1 : timpCompp) {
        //
        Iterator<Athlete> itr = timpCompp.iterator();
        while (itr.hasNext()) {
            Athlete c = itr.next();
            System.out.print(c);
        }

        //  SCRIE sortati dupa timpul final intr-un fisier exter, sportiviFinal.txt
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:\\Users\\Dumnezeu\\Desktop\\sportiviFinal.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintStream printOut = new PrintStream(out);
        System.setOut(printOut);

        //sortare dupa timp
        Set<Athlete> timpComp = new TreeSet<Athlete>(new TimeComp());
        timpComp.addAll(allAthleteList);
        System.out.println("========== sortare dupa TIMPUL FINAL cu PENALIZARI! ========== ");

        for (Athlete e1 : timpComp) {
            System.out.print(e1.getAthleteName() + " -- " + e1.getSkiTimeResult() + " timp final" + "\n");
        }
    }

    //metodele statice

    //metoda care primeste un String si returneaza penalizarea in secunde
    public static int secundePenalizare(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                counter++;
            }
        }
        int penalizare = counter * 10;
        return penalizare;
    }

    // o metoda care primeste un int de secunde si il transforma intr=un String de forma mm:ss
    public static String timeConverter(int s) {
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        String timeString = String.format("%02d:%02d", minutes, seconds);
        return timeString;
    }

    // O metoda care primeste un String de forma mm:ss si il transforma intr-un int de secunde.
    public static int transformareMminSecunde(String s) {

        String string = s;
        String[] parts = string.split(":");
        String part1 = parts[0];
        String part2 = parts[1];

        Integer totalSecunde = Integer.parseInt(part1) * 60 + Integer.parseInt(part2);
        return totalSecunde;
    }
}

