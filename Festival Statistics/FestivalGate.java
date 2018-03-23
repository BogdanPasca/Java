package com.company;
import java.util.*;

public class FestivalGate {
    private Set<Ticket> tickets = new HashSet<>();

    public synchronized void boughtTicket(Ticket ticket){
        this.tickets.add(ticket);
        System.out.println(ticket.getTicketBuyed());
    }

    Map<TicketType, Integer> getResults(){
        Map<TicketType, Integer> results  = new HashMap<>();
        for(TicketType ticketType: TicketType.values()){
            results.put(ticketType, 0);
        }
        for(Ticket ticket : tickets){
            results.put(ticket.getTicketBuyed(), results.get(ticket.getTicketBuyed())+ 1);
        }
        return results;
    }
}
