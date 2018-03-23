package com.company;

public class FestivalAttendee extends Thread {

    private FestivalGate festivalGate;
    private int ticketId;

    public FestivalAttendee(Integer ticketId, FestivalGate festivalGate) {
        this.ticketId = ticketId;
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        try {
            sleep(Randomizer.getWaitingTime() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TicketType TicketBought = TicketType.values()[Randomizer.getTicketTypeIndex(TicketType.values().length)];
        Ticket ticket = new Ticket(TicketBought);
        this.festivalGate.boughtTicket(ticket);
    }
}
