import attractions.*;
import exceptions.NegativeNumberException;
import exceptions.NegativeSoldException;
import exceptions.ToManyVisitorsException;
import shops.*;

public class ThemePark {

    public static void main(String[] args) throws NegativeSoldException, ToManyVisitorsException, NegativeNumberException {
        // write your code here
        ParkManagement parkManagement = new ParkManagement();
        Shop umbrellaShop1 = new UmbrellaShop(3);
        Shop mapShop1 = new MapShop(3);
        Shop balloonShop1 = new BalloonShop(2);
        Shop hotdogShop1 = new HotdogShop(4);


        parkManagement.addShop(umbrellaShop1);
        parkManagement.addShop(mapShop1);
        parkManagement.addShop(balloonShop1);
        parkManagement.addShop(hotdogShop1);

        Attraction carousel1 = new Carousel(3, 44);
        Attraction freeFall1 = new FreeFall(12, 32);
        Attraction rollerCoaster1 = new Rollercoaster(3, 10);
        Attraction bumperCars1 = new Bumpercars(40, 12);
        Attraction hauntedHouse1 = new HauntedHouse(20, 45);

        carousel1.setTotalDayVisitors(500);
        freeFall1.setTotalDayVisitors(250);
        hauntedHouse1.setTotalDayVisitors(200);
        rollerCoaster1.setTotalDayVisitors(2000);
        bumperCars1.setTotalDayVisitors(400);

        parkManagement.addAttraction(carousel1);
        parkManagement.addAttraction(freeFall1);
        parkManagement.addAttraction(hauntedHouse1);
        parkManagement.addAttraction(bumperCars1);
        parkManagement.addAttraction(rollerCoaster1);

        Order order1 = new Order(12,32,23);
        parkManagement.addOrder(order1);
        order1.getOrderPrice();


        parkManagement.printVisitorInformationAttractions();

        System.out.println(parkManagement.getTotalRevenue());
    }
}
