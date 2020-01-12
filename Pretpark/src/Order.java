import exceptions.NegativeIDException;
import identifiers.Stringable;
import tickets.AdultTicket;
import tickets.ChildTicket;
import tickets.ElderlyTicket;
import tickets.Ticket;
import utilities.Utility;

import javax.management.monitor.StringMonitorMBean;
import java.util.ArrayList;

public class Order implements Stringable {

    protected ArrayList<Ticket> ticketList;


    public Order(int amountChildTickets, int amountElderlyTickets, int amountAdultTickets) throws NegativeIDException {
        this.ticketList = new ArrayList<>();

        addElderlyTickets(amountElderlyTickets);
        addAdultTickets(amountAdultTickets);
        addChildTickets(amountChildTickets);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void addElderlyTickets(int amountElderlyTickets) {
        for (int i =0; i < amountElderlyTickets; i++){
            ticketList.add(new ElderlyTicket(i));
        }
    }

    public void addChildTickets(int amountChildTickets) {
        for (int i =0; i < amountChildTickets; i++){
            ticketList.add(new ChildTicket(i));
        }
    }

    public void addAdultTickets(int amountAdultTickets) throws NegativeIDException {
        for (int i =0; i < amountAdultTickets; i++){
            ticketList.add(new AdultTicket(i));
        }
    }

    public double getOrderPrice() {
        double orderPrice = 0;
        for (Ticket ticket : ticketList) {
            orderPrice += ticket.getTicketPrice();
        }
        return orderPrice;
    }
}
