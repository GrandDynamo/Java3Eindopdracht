package tickets;

import utilities.Utility;

public class ChildTicket extends Ticket {
    private final double TICKET_PRICE = 15.00;
    private final String uniqueIDString;

    public ChildTicket(int uniqueIDInt){
        super();
        this.uniqueIDString = getClass().getSimpleName() + uniqueIDInt;
    }

    @Override
    public double getTicketPrice() {
        return TICKET_PRICE;
    }

    @Override
    public String toString() {
        return uniqueIDString;
    }
}
