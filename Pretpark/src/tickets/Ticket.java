package tickets;

import identifiers.Identifiable;

// TODO: FINISH TICKET CLASS AND IMPLEMENT CHILDS. ALSO USE SUPER?
public abstract class Ticket implements Identifiable {
    public int ticketId;

    public Ticket() {
        int randomInt = (int)(Math.random()*100);

        this.ticketId = randomInt;
    }

    @Override
    public abstract String getIdentifier();

    public abstract double getTicketPrice();
}
