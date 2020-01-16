package shops;

import exceptions.NegativeSoldException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void testToString() throws NegativeSoldException {
        Shop umbrellaShop1 = new UmbrellaShop(100);
        assertEquals("I sell umbrellas.", umbrellaShop1.toString());
    }
}