package tickets;

import exceptions.NegativeIDException;
import exceptions.NegativeSoldException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultTicketTest {

    @Test
    void getTicketPrice_Should_be_15() throws NegativeIDException {
        Ticket adultTicket1 = new AdultTicket(12);
        assertEquals(15.00, adultTicket1.getTicketPrice());
    }
    @Test
    void getTicketPrice_Should_be_Exception(){
        assertThrows(NegativeIDException.class, () -> {
                Ticket adultTicket1 = new AdultTicket(-12);
        });
    }
}