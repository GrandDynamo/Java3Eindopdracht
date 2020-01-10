package tickets;

import identifiers.Identifiable;

public abstract class Ticket implements Identifiable {
    public Ticket() {
    }

    @Override
    public abstract int getIdentifier();
}
