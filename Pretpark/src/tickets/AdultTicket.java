package tickets;

import exceptions.NegativeNumberException;

public class AdultTicket extends Ticket {
    private final double TICKET_PRICE = 15.00;
    private final String uniqueIDString;

    public AdultTicket(int uniqueIDInt)throws NegativeNumberException {
        super();
        if (uniqueIDInt < 0){
            throw new NegativeNumberException();
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
