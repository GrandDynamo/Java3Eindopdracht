import exceptions.NegativeItemsSoldException;
import org.junit.jupiter.api.BeforeEach;
import shops.*;

import static org.junit.jupiter.api.Assertions.*;

class ParkManagementTest {

    public ParkManagement parkManagement;

    @BeforeEach
    void beforeEach() throws NegativeItemsSoldException {
        parkManagement = new ParkManagement();
    }

    @org.junit.jupiter.api.Test
    void getTotalShopsDayRevenue() throws NegativeItemsSoldException {
        Shop umbrellaShop1 = new UmbrellaShop(9, 1);
        Shop mapShop1 = new MapShop(3, 1);
        Shop balloonShop1 = new BalloonShop(5, 1);
        Shop hotdogShop1 = new HotdogShop(12, 1);

        this.parkManagement.addShop(umbrellaShop1);
        this.parkManagement.addShop(mapShop1);
        this.parkManagement.addShop(balloonShop1);
        this.parkManagement.addShop(hotdogShop1);

        assertEquals(182.86, this.parkManagement.getTotalShopsDayRevenue());
    }
}