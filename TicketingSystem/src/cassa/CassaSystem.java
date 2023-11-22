package cassa;

import java.util.ArrayList;
import java.util.List;

public class CassaSystem {
    //private List<Ticket> ticketList;
    private List<Customer> customerList;

    public CassaSystem() {
        customerList = new ArrayList<>();
    }

    public void addCustomerToList(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomerFromList(Customer customer) {
        customerList.remove(customer);
    }

    public int checkSeatAvailable() {
        int index = -1;
        List<Ticket> seatTicketList = Ticket.getSeatTicketList();
        for (int i = 0; i < seatTicketList.size(); i++) {
            if (seatTicketList.get(i).getStatus() == Status.AVAILABLE) {
                return i;
            }
        }
        return index;
    }

    public int checkVipAvailable() {
        int index = -1;
        List<Ticket> vipTicketList = Ticket.getVipTicketList();
        for (int i = 0; i < vipTicketList.size(); i++) {
            if (vipTicketList.get(i).getStatus() == Status.AVAILABLE) {
                return i;
            }
        }
        return index;
    }

    public int checkStandAvailable() {
        int index = -1;
        List<Ticket> standTicketList = Ticket.getStandTicketList();
        for (int i = 0; i < standTicketList.size(); i++) {
            if (standTicketList.get(i).getStatus() == Status.AVAILABLE) {
                return i;
            }
        }
        return index;
    }

}
