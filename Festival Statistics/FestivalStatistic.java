package com.company;

public class FestivalStatistic extends Thread {

    private FestivalGate festivalGate;

    public FestivalStatistic(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        while(true) {
            Main.printStatistic("Ticket type statistics untill now:", this.festivalGate.getResults());
            try {
                sleep(5000);
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }

        }
    }
}
