package cassa;

import java.util.ArrayList;
import java.util.List;

public class CassaSystem {
    //private List<Ticket> ticketList;
    private List<Customer> customerList;

    private List<Ticket> ticketList;

    public CassaSystem() {
        customerList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addToTicketToList(Ticket ticket){
        ticketList.add(ticket);
    }

    public void addCustomerToList(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomerFromList(Customer customer) {
        customerList.remove(customer);
    }

    public int checkTicketAvailable(TicketType type) {
        int index = -1;
        for (int i = 0; i < ticketList.size(); i++) {
            if(ticketList.get(i).getType()==type){
                if (ticketList.get(i).getStatus() == Status.AVAILABLE) {
                    return i;
                }
            }
        }
        return index;
    }



}
