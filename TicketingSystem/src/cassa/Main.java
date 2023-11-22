package cassa;

public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < 10; i++) {
            ticket = new Ticket(TicketType.SEAT, Status.AVAILABLE);
        }
        for (int i = 0; i < 1; i++) {
            ticket = new Ticket(TicketType.VIP, Status.AVAILABLE);
        }
        for (int i = 0; i < 15; i++) {
            ticket = new Ticket(TicketType.STANDING_TICKET, Status.AVAILABLE);
        }

        CassaSystem cassaSystem = new CassaSystem();
        Customer customerAA = new Customer("AA", "11111111.22222222");
        Ticket seatTicketAA = ticketBuying(cassaSystem, TicketType.SEAT);
        if (seatTicketAA == null) {
            System.out.println("You wont be able to buy any seat ticket.");
        }

        Customer customerAB = new Customer("AB", "11111111.22222223");

        Ticket seatTicketAB = ticketBuying(cassaSystem, TicketType.SEAT);
        if (seatTicketAA == null) {
            System.out.println("You wont be able to buy any seat ticket.");
        }


        Customer customerAC = new Customer("AC", "11111111.22222224");
        Ticket seatTicketAC = ticketBuying(cassaSystem, TicketType.SEAT);
        if (seatTicketAA == null) {
            System.out.println("You wont be able to buy any seat ticket.");
        }


        Customer customerAF = new Customer("AF", "11111111.22222227");
        Customer customerAG = new Customer("AG", "11111111.22222228");
        Customer customerVipA = new Customer("AG", "11111111.22222228");
        Ticket vipTicketA = ticketReservation(cassaSystem, TicketType.VIP);
        if (vipTicketA == null) {
            System.out.println("You wont be able to buy any VIP ticket.");
        }

        Customer customerVipB = new Customer("AG", "11111111.22222228");
        Ticket vipTicketB = ticketReservation(cassaSystem, TicketType.VIP);
        if (vipTicketA == null) {
            System.out.println("You wont be able to buy any VIP ticket.");
        }
        Customer customerVipC = new Customer("AG", "11111111.22222228");
        Customer customerBB = new Customer("AB", "11111111.22222223");
        Ticket standTicketBB = ticketBuying(cassaSystem, TicketType.STANDING_TICKET);
        if (standTicketBB == null) {
            System.out.println("You wont be able to buy any standing ticket.");
        }

        Customer customerBC = new Customer("AC", "11111111.22222224");
        Customer customerBD = new Customer("AD", "11111111.22222225");
        Customer customerBE = new Customer("AE", "11111111.22222226");

        System.out.println(Ticket.getSeatTicketList());
        System.out.println(Ticket.getVipTicketList());
        System.out.println(Ticket.getStandTicketList());
    }

    public static Ticket ticketBuying(CassaSystem cassaSystem, TicketType ticketType) {
        if (ticketType == TicketType.SEAT) {
            int index = cassaSystem.checkSeatAvailable();
            if (index >= 0) {
                Ticket.getSeatTicketList().get(index).setStatus(Status.SOLD);
                return Ticket.getSeatTicketList().get(index);
            } else {
                System.out.println("There isn't any available seat ticket.");
            }
        } else if (ticketType == TicketType.STANDING_TICKET) {
            int index = cassaSystem.checkStandAvailable();
            if (index >= 0) {
                Ticket.getStandTicketList().get(index).setStatus(Status.SOLD);
                return Ticket.getStandTicketList().get(index);
            } else {
                System.out.println("There isn't any available standing ticket.");
            }
        }

        return null;
    }

    public static Ticket ticketReservation(CassaSystem cassaSystem, TicketType ticketType) {
        if (ticketType == TicketType.VIP) {
            int index = cassaSystem.checkVipAvailable();
            if (index >= 0) {
                Ticket.getVipTicketList().get(index).setStatus(Status.RESERVED);
                return Ticket.getVipTicketList().get(index);
            } else {
                System.out.println("There isn't any available VIP ticket.");
            }
        }
        return null;
    }


}
