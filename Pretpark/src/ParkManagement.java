import attraction.Attraction;
import shops.HotdogShop;
import shops.Shop;
import tickets.ChildTicket;
import tickets.Ticket;

import java.util.ArrayList;

public class ParkManagement {
    private ArrayList<Order> orderList;
    private ArrayList<Attraction> attractionList;
    private double dayRevenue;
    private int totalDayVisitors;
    private int totalDayElderlyVisitors;

    public ParkManagement() {
        orderList = new ArrayList<>();
        attractionList = new ArrayList<>();

        Shop hotdogShop = new HotdogShop();
        System.out.println(hotdogShop.getIdentifier());
    }

    public void addOrder(int orderId) {
        orderList.add(new Order());
    }

    public void addAttraction(Attraction attraction){
        attractionList.add(attraction);
    }
}
