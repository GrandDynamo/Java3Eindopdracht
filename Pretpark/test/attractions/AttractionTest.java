package attractions;

import exceptions.NegativeNumberException;
import exceptions.ToManyVisitorsException;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.*;

class AttractionTest {

    @Test
    void test_to_string() throws NegativeNumberException {
        Attraction bumpercars1 = new Bumpercars(2, 10);
        assertEquals("I am a bumpercar attraction.", bumpercars1.toString());
    }
}