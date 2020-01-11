import attractions.Attraction;
import exceptions.NegativeItemsSoldException;
import shops.HotdogShop;
import shops.MapShop;
import shops.Shop;
import shops.UmbrellaShop;
import utilities.Utility;

import java.util.ArrayList;

public class ParkManagement {
    private ArrayList<Order> orderArrayList;
    private ArrayList<Attraction> attractionArrayList;
    private ArrayList<Shop> shopArrayList;
    private double dayRevenue;
    private int totalDayVisitors;
    private int totalDayElderlyVisitors;

    public ParkManagement() {
        orderArrayList = new ArrayList<>();
        attractionArrayList = new ArrayList<>();
        shopArrayList = new ArrayList<>();
    }

    public void addOrder(int orderId) {
        orderArrayList.add(new Order());
    }

    public void addAttraction(Attraction attraction){
        attractionArrayList.add(attraction);
    }
    public void addShop(Shop shop){
        shopArrayList.add(shop);
    }

    private double calculateTotalShopsDayRevenue(){
        double totalShopsRevenue = 0;
        for (Shop shop : shopArrayList) {
//            System.out.println(shop.getUniqueShopID()); //TODO niet vergeten dit weg te halen in release 01.
            totalShopsRevenue += shop.getDayRevenue();
        }
        return Utility.roundTwoDecimal(totalShopsRevenue);
    }

    public double getTotalShopsDayRevenue(){
        return calculateTotalShopsDayRevenue();
    }
}
