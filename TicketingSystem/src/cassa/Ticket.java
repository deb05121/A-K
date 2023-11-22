package cassa;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    protected TicketType type;
    protected Status status;
    protected int pieces;
    protected static List<Ticket> seatTicketList;
    protected static List<Ticket> vipTicketList;
    protected static List<Ticket> standTicketList;

    public Ticket() {
        seatTicketList = new ArrayList<>();
        vipTicketList = new ArrayList<>();
        standTicketList = new ArrayList<>();
    }

    public Ticket(TicketType ticketType, Status status) {
        this.type = ticketType;
        this.status = status;
        if (ticketType.equals(TicketType.SEAT)) {
            seatTicketList.add(this);
        } else if (ticketType.equals(TicketType.VIP)) {
            vipTicketList.add(this);
        } else if (ticketType.equals(TicketType.STANDING_TICKET)) {
            standTicketList.add(this);
        }
    }

    public void addTicketToSeatList(Ticket ticket) {
        seatTicketList.add(ticket);
    }

    public void removeTicketFromSeatList(Ticket ticket) {
        seatTicketList.remove(ticket);
    }

    public static List<Ticket> getSeatTicketList() {
        return seatTicketList;
    }

    public void addTicketToVipList(Ticket ticket) {
        vipTicketList.add(ticket);
    }

    public void removeTicketFromVipList(Ticket ticket) {
        vipTicketList.remove(ticket);
    }

    public static List<Ticket> getVipTicketList() {
        return vipTicketList;
    }

    public void addTicketToStandList(Ticket ticket) {
        standTicketList.add(ticket);
    }

    public void removeTicketFromStandList(Ticket ticket) {
        standTicketList.remove(ticket);
    }

    public static List<Ticket> getStandTicketList() {
        return standTicketList;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "\n+------------------------+\n" +
                String.format("| Type:  %15s |\n", type) +
                String.format("| Price: %15d |\n",type.getPrice()) +
                String.format("| Status: %14s |\n",status) +
                "+------------------------+\n"
                ;
    }
}
