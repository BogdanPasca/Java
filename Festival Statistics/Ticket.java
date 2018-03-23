package com.company;

public class Ticket {
    private TicketType TicketBuyed;

    public Ticket(TicketType TicketBuyed) {
        this.TicketBuyed = TicketBuyed;
    }

    TicketType getTicketBuyed(){
        return TicketBuyed;
    }
}
