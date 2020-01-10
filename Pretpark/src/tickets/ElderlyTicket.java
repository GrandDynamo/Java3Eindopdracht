package tickets;

public class ElderlyTicket extends Ticket {
    public static final double TICKET_PRICE = 25.00;

    public ElderlyTicket(int ticketId) {
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
