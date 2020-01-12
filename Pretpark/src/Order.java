import tickets.AdultTicket;
import tickets.ChildTicket;
import tickets.ElderlyTicket;
import tickets.Ticket;
import utilities.Utility;

import java.util.ArrayList;

public class Order {
    public int orderId;

    protected ArrayList<Ticket> ticketList;
    protected double orderPrice;
    private final String UNIQUE_ORDER_ID;

    public Order() {
        this.orderId = 123;
        this.ticketList = new ArrayList<>();
        this.UNIQUE_ORDER_ID = Utility.generateUniqueID("T");
    }

    public int getOrderId() {
        return orderId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void addTicket(int age) {
        if(age < 5) {
            this.ticketList.add(new ChildTicket());
        } else if(age > 5 && age < 65) {
            this.ticketList.add(new AdultTicket());
        } else {
            this.ticketList.add(new ElderlyTicket());
        }
    }

    public void setOrderPrice() {
        for (Ticket ticket: ticketList) {
            this.orderPrice += ticket.getTicketPrice();
        }
    }
}
