package cassa;

public class Ticket {
    protected TicketType type;
    protected Status status;

    public Ticket(TicketType ticketType, Status status) {
        this.type = ticketType;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public TicketType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n+------------------------+\n" +
                String.format("| Type:  %15s |\n", type) +
                String.format("| Price: %15d |\n", type.getPrice()) +
                String.format("| Status: %14s |\n", status) +
                "+------------------------+\n"
                ;
    }
}
