package tickets;

public class ChildTicket extends Ticket {
    private final double TICKET_PRICE = 9.50;

    public ChildTicket() {
        super();
    }

    @Override
    public String getIdentifier() {
        return "I am a child ticket";
    }

    @Override
    public double getTicketPrice() {
        return TICKET_PRICE;
    }

}
