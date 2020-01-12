package tickets;

import identifiers.Identifiable;
import utilities.Utility;

public abstract class Ticket implements Identifiable {

    public Ticket() {
    }

    public abstract double getTicketPrice();

    public abstract String toString();

}
