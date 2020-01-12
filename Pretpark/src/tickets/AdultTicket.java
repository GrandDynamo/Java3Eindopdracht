package tickets;

import exceptions.NegativeIDException;

public class AdultTicket extends Ticket {
    private final double TICKET_PRICE = 15.00;
    private final String uniqueIDString;

    public AdultTicket(int uniqueIDInt)throws NegativeIDException {
        super();
        if (uniqueIDInt < 0){
            throw new NegativeIDException();
        }
        this.uniqueIDString = getClass().getSimpleName() + uniqueIDInt;
    }

    @Override
    public double getTicketPrice() {
        return TICKET_PRICE;
    }

    public String toString() {
        return this.uniqueIDString;
    }
}
