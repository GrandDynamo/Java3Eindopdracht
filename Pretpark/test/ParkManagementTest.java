import attractions.Attraction;
import attractions.Carousel;
import attractions.HauntedHouse;
import attractions.Rollercoaster;
import exceptions.NegativeNumberException;
import exceptions.NegativeSoldException;
import exceptions.ToManyVisitorsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shops.*;

import static org.junit.jupiter.api.Assertions.*;

class ParkManagementTest {

    public ParkManagement parkManagement;

    @BeforeEach
    void beforeEach() throws NegativeSoldException {
        parkManagement = new ParkManagement();
    }

    @org.junit.jupiter.api.Test
    void the_addorder_size_should_be_2() throws NegativeNumberException {
        Order order1 = new Order(10, 5, 2);
        Order order2 = new Order(12, 3, 263);
        parkManagement.addOrder(order1);
        parkManagement.addOrder(order2);
        assertEquals(2, parkManagement.getOrderArrayList().size());
    }

    @Test
    void the_addorder_should_throw_an_NegativeNumberException() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class, () -> {
            Order order1 = new Order(-2, 5, 2);
            Order order2 = new Order(12, 3, 263);
            parkManagement.addOrder(order1);
            parkManagement.addOrder(order2);
            parkManagement.getOrderArrayList().size();
        });
    }

    @Test
    void the_add_attraction_arrayList_size_should_be_3() throws NegativeNumberException {
        Attraction rollercoaster1 = new Rollercoaster(30, 40);
        Attraction carousel1 = new Carousel(1, 40);
        Attraction hauntedHouse1 = new HauntedHouse(30, 4);

        parkManagement.addAttraction(rollercoaster1);
        parkManagement.addAttraction(carousel1);
        parkManagement.addAttraction(hauntedHouse1);

        assertEquals(3, parkManagement.getAttractionArrayList().size());
    }

    @Test
    void inserting_a_negative_number_inside_an_attraction_parameter_should_return_a_NegativeNumberException() {
        assertThrows(NegativeNumberException.class, () -> {
            Attraction rollercoaster1 = new Rollercoaster(-30, 40);
            Attraction carousel1 = new Carousel(1, 40);
            Attraction hauntedHouse1 = new HauntedHouse(30, -4);
        });
    }

    @Test
    void add_Shop_arrayShopList_should_be_4() throws NegativeSoldException {
        Shop balloonShop1 = new BalloonShop(12);
        Shop hotdogShop1 = new HotdogShop(43);
        Shop mapShop1 = new MapShop(23);
        Shop umbrellaShop1 = new UmbrellaShop(19);

        parkManagement.addShop(balloonShop1);
        parkManagement.addShop(hotdogShop1);
        parkManagement.addShop(mapShop1);
        parkManagement.addShop(umbrellaShop1);

        assertEquals(4, parkManagement.getShopArrayList().size());

    }

    @Test
    void add_shop_with_negative_parameter_should_return_a_NegativeSoldException() {
        assertThrows(NegativeSoldException.class, () -> {
            Shop balloonShop1 = new BalloonShop(-12);
        });
    }

    @org.junit.jupiter.api.Test
    void getTotalShopsDayRevenue_ShouldReturnCorrectNumber() throws NegativeSoldException {
        Shop umbrellaShop1 = new UmbrellaShop(9);
        Shop mapShop1 = new MapShop(3);
        Shop balloonShop1 = new BalloonShop(5);
        Shop hotdogShop1 = new HotdogShop(12);

        this.parkManagement.addShop(umbrellaShop1);
        this.parkManagement.addShop(mapShop1);
        this.parkManagement.addShop(balloonShop1);
        this.parkManagement.addShop(hotdogShop1);

        assertEquals(182.86, this.parkManagement.getTotalShopsDayRevenue());
    }

    /**
     * Tests the calculate shop and calculate order revenue methods.
     * @throws NegativeSoldException
     * @throws NegativeNumberException
     */
    @Test
    void getTotalRevenue_Should_return_correct_value() throws NegativeSoldException, NegativeNumberException {
        Shop umbrellaShop1 = new UmbrellaShop(9);
        Shop mapShop1 = new MapShop(3);
        Shop balloonShop1 = new BalloonShop(5);
        Shop hotdogShop1 = new HotdogShop(12);

        Order order1 = new Order(12,4,12);


        this.parkManagement.addShop(umbrellaShop1);
        this.parkManagement.addShop(mapShop1);
        this.parkManagement.addShop(balloonShop1);
        this.parkManagement.addShop(hotdogShop1);

        this.parkManagement.addOrder(order1);

        assertEquals(510.66, parkManagement.getTotalRevenue());
    }

    @Test
    void getBusiestAttraction_should_return_hauntedHouse1() throws NegativeNumberException, ToManyVisitorsException {
        Attraction rollercoaster1 = new Rollercoaster(3, 40);
        Attraction carousel1 = new Carousel(1, 12);
        Attraction hauntedHouse1 = new HauntedHouse(30, 4);

        parkManagement.addAttraction(rollercoaster1);
        parkManagement.addAttraction(carousel1);
        parkManagement.addAttraction(hauntedHouse1);

        carousel1.setTotalDayVisitors(500);
        hauntedHouse1.setTotalDayVisitors(150);
        rollercoaster1.setTotalDayVisitors(3000);
        assertEquals(hauntedHouse1, parkManagement.getBussiestAttraction());
    }

    @Test
    void getWorstShop_should_return_hotdogShop1() throws NegativeSoldException {
        Shop umbrellaShop1 = new UmbrellaShop(9);
        Shop mapShop1 = new MapShop(3);
        Shop balloonShop1 = new BalloonShop(5);
        Shop hotdogShop1 = new HotdogShop(12);

        this.parkManagement.addShop(umbrellaShop1);
        this.parkManagement.addShop(mapShop1);
        this.parkManagement.addShop(balloonShop1);
        this.parkManagement.addShop(hotdogShop1);

        assertEquals(hotdogShop1, parkManagement.getWorstShop());
    }
}