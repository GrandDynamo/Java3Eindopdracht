package tickets;

import identifiers.Identifiable;
import utilities.Utility;

public abstract class Ticket implements Identifiable {
    private final String UNIQUE_TICKET_ID;

    public Ticket() {
        UNIQUE_TICKET_ID = Utility.generateUniqueID("S");
    }

    @Override
    public abstract String getIdentifier();

    public abstract double getTicketPrice();
}
