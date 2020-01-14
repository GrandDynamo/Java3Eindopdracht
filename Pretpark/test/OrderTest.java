import exceptions.NegativeNumberException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    @BeforeEach
    void beforeEach() throws NegativeNumberException {
        this.order = new Order(5, 2, 10);
    }

    @Test
    void addElderlyTickets_should_add_5_tickets() {
        assertEquals(215.90, order.getOrderPrice());
    }
}