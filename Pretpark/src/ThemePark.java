import exceptions.NegativeItemsSoldException;
import shops.*;
import tickets.ChildTicket;
import tickets.Ticket;

public class ThemePark {

    public static void main(String[] args) throws NegativeItemsSoldException {
        // write your code here
        ParkManagement parkManagement = new ParkManagement();
        parkManagement.addShop(new UmbrellaShop(9, 1));
        parkManagement.addShop(new UmbrellaShop(5, 2));
        parkManagement.addShop(new MapShop(3, 1));
        parkManagement.addShop(new BalloonShop(5, 1));
        parkManagement.addShop(new HotdogShop(12, 1));
//        System.out.println(parkManagement.getTotalShopsDayRevenue());
        Order order1 = new Order(12,32,23);
        parkManagement.addOrder(order1);
        order1.getOrderPrice();


        System.out.println(parkManagement.getTotalShopsDayRevenue());
    }
}
