import tickets.Ticket;

import java.util.ArrayList;

public class Order {
    public int orderId;

    private Customer customer;
    protected ArrayList<Ticket> ticketList;
    protected double orderPrice;

    public Order(int orderId, String customerName, int customerAge) {
        this.customer = new Customer(customerName, customerAge);
        this.orderId = orderId;
        this.ticketList = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addTicket(int age) {
    }
}
