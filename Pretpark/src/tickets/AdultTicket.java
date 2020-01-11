package tickets;

public class AdultTicket extends Ticket {
    private final double TICKET_PRICE = 15.00;

    public AdultTicket(){
        super();
    }

    @Override
    public String getIdentifier() {
        return "I am an adult ticket.";
    }

    @Override
    public double getTicketPrice() {
        return TICKET_PRICE;
    }
}
