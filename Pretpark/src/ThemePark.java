import exceptions.NegativeItemsSoldException;
import shops.*;

public class ThemePark {

    public static void main(String[] args) throws NegativeItemsSoldException {
        // write your code here
        ParkManagement parkManagement = new ParkManagement();

        Shop umbrellaShop1 = new UmbrellaShop(9);
        Shop mapShop1 = new MapShop(3);
        Shop balloonShop1 = new BalloonShop(5);
        Shop hotdogShop1 = new HotdogShop(12);

        parkManagement.addShop(umbrellaShop1);
        parkManagement.addShop(mapShop1);
        parkManagement.addShop(balloonShop1);
        parkManagement.addShop(hotdogShop1);

        System.out.println(parkManagement.getTotalShopsDayRevenue());
    }
}
