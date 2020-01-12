import tickets.AdultTicket;
import tickets.ChildTicket;
import tickets.ElderlyTicket;
import tickets.Ticket;
import utilities.Utility;

import java.util.ArrayList;

public class Order {

    protected ArrayList<Ticket> ticketList;
    private final String UNIQUE_ORDER_ID;


    public Order(int amountChildTickets, int amountElderlyTickets, int amountAdultTickets) {
        this.ticketList = new ArrayList<>();
        this.UNIQUE_ORDER_ID = Utility.generateUniqueID("ORDER");

        addElderlyTickets(amountElderlyTickets);
        addAdultTickets(amountAdultTickets);
        addChildTickets(amountChildTickets);
    }

    public String getOrderId() {
        return UNIQUE_ORDER_ID;
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

    public void addAdultTickets(int amountAdultTickets) {
        for (int i =0; i < amountAdultTickets; i++){
            ticketList.add(new AdultTicket(i));
        }
    }

    public double getOrderPrice() {
        double orderPrice = 0;
        for (Ticket ticket : ticketList) {
            orderPrice += ticket.getTicketPrice();
            System.out.println(ticket + " : " + ticket.getTicketPrice());
        }
        return orderPrice;
    }
    public Ticket getTicket(String ticketID){
        for (Ticket ticket: ticketList) {
            if (ticket.equals(ticketID)){
                return ticket;
            }
        }
        return null;
    }
}
