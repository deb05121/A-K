package cassa;

public class Main {

    public static void main(String[] args) {
        int seatPieces = 10;
        int vipPieces = 1;
        int standPieces = 15;

        CassaSystem cassaSystem = new CassaSystem();
        for (int i = 0; i < seatPieces; i++) {
            Ticket ticket = new Ticket(TicketType.SEAT, Status.AVAILABLE);
            cassaSystem.addToTicketToList(ticket);
        }
        for (int i = 0; i < vipPieces; i++) {
            Ticket ticket = new Ticket(TicketType.VIP, Status.AVAILABLE);
            cassaSystem.addToTicketToList(ticket);
        }
        for (int i = 0; i < standPieces; i++) {
            Ticket ticket = new Ticket(TicketType.STANDING_TICKET, Status.AVAILABLE);
            cassaSystem.addToTicketToList(ticket);
        }

        Customer customerAA = new Customer("AA", "11111111.22222222");
        cassaSystem.addCustomerToList(customerAA);
        tryGiveTicket(cassaSystem, TicketType.SEAT, Status.SOLD);

        Customer customerAB = new Customer("AB", "11111111.22222223");
        cassaSystem.addCustomerToList(customerAB);
        tryGiveTicket(cassaSystem, TicketType.SEAT, Status.SOLD);

        Customer customerAC = new Customer("AC", "11111111.22222224");
        cassaSystem.addCustomerToList(customerAC);
        tryGiveTicket(cassaSystem, TicketType.SEAT, Status.SOLD);

        Customer customerAF = new Customer("AF", "11111111.22222227");
        cassaSystem.addCustomerToList(customerAF);

        Customer customerAG = new Customer("AG", "11111111.22222228");
        cassaSystem.addCustomerToList(customerAG);

        Customer customerVipA = new Customer("AG", "11111111.22222228");
        cassaSystem.addCustomerToList(customerVipA);
        tryGiveTicket(cassaSystem, TicketType.VIP, Status.RESERVED);

        Customer customerVipB = new Customer("AG", "11111111.22222228");
        cassaSystem.addCustomerToList(customerVipB);
        tryGiveTicket(cassaSystem, TicketType.VIP, Status.RESERVED);

        Customer customerVipC = new Customer("AG", "11111111.22222228");
        cassaSystem.addCustomerToList(customerVipC);

        Customer customerBB = new Customer("AB", "11111111.22222223");
        cassaSystem.addCustomerToList(customerBB);
        tryGiveTicket(cassaSystem, TicketType.STANDING_TICKET, Status.SOLD);


        Customer customerBC = new Customer("AC", "11111111.22222224");
        cassaSystem.addCustomerToList(customerBC);

        Customer customerBD = new Customer("AD", "11111111.22222225");
        cassaSystem.addCustomerToList(customerBD);

        Customer customerBE = new Customer("AE", "11111111.22222226");
        cassaSystem.addCustomerToList(customerBE);

        System.out.println(cassaSystem.getTicketList());
        System.out.println(cassaSystem.getCustomerList());
    }

    public static void tryGiveTicket(CassaSystem cassaSystem, TicketType ticketType, Status status) {
        int index = cassaSystem.checkTicketAvailable(ticketType);
        if (index >= 0) {
            cassaSystem.getTicketList().get(index).setStatus(status);

        } else {
            System.out.printf("There isn't any available %s ticket.\n", ticketType);
        }

    }

}
