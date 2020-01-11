package tickets;

public class ElderlyTicket extends Ticket {
    private final double TICKET_PRICE = 12.95;

    public ElderlyTicket() {
        super();
    }

    @Override
    public String getIdentifier() {
        return "I am an elderly ticket.";
    }

    @Override
    public double getTicketPrice() {
        return TICKET_PRICE;
    }
}
