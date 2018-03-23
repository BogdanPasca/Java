package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        FestivalGate festivalGate = new FestivalGate();
        int ticketCount = Randomizer.getFestivalAttendeesCount();


        FestivalAttendee[] festivalAttendees = new FestivalAttendee[ticketCount];
        for (int i = 0; i < ticketCount; i++) {
            festivalAttendees[i] = new FestivalAttendee(i, festivalGate);
            festivalAttendees[i].start();
        }

        FestivalStatistic festivalStatistic = new FestivalStatistic(festivalGate);
        festivalStatistic.setDaemon(true);
        festivalStatistic.start();

        for (FestivalAttendee festivalAttendee : festivalAttendees) {
            try {
                festivalAttendee.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //display results
        Main.printResults(String.valueOf(festivalAttendees.length) + " PEOPLE ENTERED!!\n", festivalGate.getResults());

    }

    public static void printResults(String message, Map<TicketType, Integer> results) {
        System.out.println("-------------------");
        System.out.println(message);


        for (TicketType ticketType : results.keySet()) {

            System.out.println(results.get(ticketType) + " people have " + ticketType + " passes.");
        }
        System.out.println("-------------------");
    }

    // metoda care printeaza statisticile de la poarta doar cand a intrat cel putin o persoana
    public static void printStatistic(String message, Map<TicketType, Integer> results) {
        System.out.println("-------------------");
        System.out.println(message);
        for (TicketType ticketType : results.keySet()) {
            if (results.get(ticketType) > 0) {
                System.out.println(ticketType + ":" + results.get(ticketType));
            }
        }
        System.out.println("-------------------");
    }

}
