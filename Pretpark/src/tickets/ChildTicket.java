package tickets;

public class ChildTicket extends Ticket {
    private final double TICKET_PRICE = 8.00;
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
