package tickets;

import identifiers.Stringable;

public abstract class Ticket implements Stringable {

    public Ticket() {
    }

    public abstract double getTicketPrice();

    public abstract String toString();

}
