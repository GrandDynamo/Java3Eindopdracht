import attraction.Attraction;
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

        //####################################-Begin test gegevens-################################################################//
        Shop hotdogShop = new HotdogShop(21);
        Shop umbrellaShop = new UmbrellaShop(32);
        Shop mapShop = new MapShop(50);
        shopArrayList.add(hotdogShop);
        shopArrayList.add(umbrellaShop);
        shopArrayList.add(mapShop);

        System.out.println(getTotalShopsDayRevenue());
        //####################################-Einde test gegevens-################################################################//
    }

    public void addOrder(int orderId) {
        orderArrayList.add(new Order());
    }

    public void addAttraction(Attraction attraction){
        attractionArrayList.add(attraction);
    }

    private double calculateTotalShopsDayRevenue(){
        double totalShopsRevenue = 0;
        for (Shop shop : shopArrayList) {
            System.out.println(shop.getUniqueShopID());
            totalShopsRevenue += shop.getDayRevenue();
        }
        return Utility.roundTwoDecimal(totalShopsRevenue);
    }

    public double getTotalShopsDayRevenue(){
        return calculateTotalShopsDayRevenue();
    }
}
