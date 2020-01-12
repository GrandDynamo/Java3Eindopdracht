import attractions.Attraction;
import exceptions.NegativeSoldException;
import shops.*;
import utilities.Utility;

import java.util.ArrayList;

public class ParkManagement {
    private ArrayList<Order> orderArrayList;
    private ArrayList<Attraction> attractionArrayList;
    private ArrayList<Shop> shopArrayList;
    private double dayRevenue;
    private int totalDayVisitors;
    private int totalDayElderlyVisitors;

    public ParkManagement() throws NegativeSoldException {
        orderArrayList = new ArrayList<>();
        attractionArrayList = new ArrayList<>();
        shopArrayList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderArrayList.add(order);
    }

    public void addAttraction(Attraction attraction) {
        attractionArrayList.add(attraction);
    }

    public void addShop(Shop shop) {
        shopArrayList.add(shop);
    }

    private double calculateTotalShopsDayRevenue() {
        double totalShopsRevenue = 0;
        for (Shop shop : shopArrayList) {
            totalShopsRevenue += shop.getDayRevenue();
        }
        return Utility.roundTwoDecimal(totalShopsRevenue);
    }

    private double calculateTotalOrderRevenue(){
        double totalOrderRevenue = 0;
        for(Order order : orderArrayList){
            totalOrderRevenue += order.getOrderPrice();
        }
        return Utility.roundTwoDecimal(totalOrderRevenue);
    }

    public double getTotalShopsDayRevenue() {
        return calculateTotalShopsDayRevenue();
    }
    public double getTotalRevenue(){
        return calculateTotalOrderRevenue() + calculateTotalOrderRevenue();
    }

    public void printMaxVisitorsEachAttraction() {
        for (Attraction attraction : attractionArrayList) {
            System.out.println(attraction.getMaxVisitors());
        }
    }
    public void printVisitorInformationAttractions(){
        for (Attraction attraction : attractionArrayList) {
            attraction.printDifferenceBetweenMaxAndTotalVisitors();
        }
    }
}
