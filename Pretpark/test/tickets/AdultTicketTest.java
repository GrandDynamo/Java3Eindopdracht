package tickets;

import exceptions.NegativeNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultTicketTest {

    @Test
    void getTicketPrice_Should_be_15() throws NegativeNumberException {
        Ticket adultTicket1 = new AdultTicket(12);
        assertEquals(15.00, adultTicket1.getTicketPrice());
    }
}