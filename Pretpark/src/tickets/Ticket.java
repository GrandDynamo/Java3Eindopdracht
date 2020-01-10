package tickets;

import identifiers.Identifiable;

public class Ticket implements Identifiable {
    public Ticket() {
    }

    @Override
    public int getIdentifier() {
        return 0;
    }
}
