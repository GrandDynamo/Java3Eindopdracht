package tickets;

import identifiers.Identifiable;

public abstract class Ticket implements Identifiable {
    public int ticketId;
    private double ticketPrice;

    public Ticket() {
    }

    @Override
    public abstract String getIdentifier();
}
