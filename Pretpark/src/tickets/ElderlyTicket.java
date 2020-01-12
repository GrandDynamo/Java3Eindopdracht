package tickets;

public class ElderlyTicket extends Ticket {
    private final double TICKET_PRICE = 12.95;
    private final String uniqueIDString;

    public ElderlyTicket(int uniqueIDInt) {
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
