import attractions.Attraction;
import shops.*;
import utilities.Utility;

import java.util.ArrayList;

public class ParkManagement {
    private ArrayList<Order> orderArrayList;
    private ArrayList<Attraction> attractionArrayList;
    private ArrayList<Shop> shopArrayList;
    //    private Attraction bussiestAttraction;
//    private Shop worstShop;
    private double dayRevenue;
    private int totalDayVisitors;
    private int totalDayElderlyVisitors;

    public ParkManagement() {
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

    private double calculateTotalOrderRevenue() {
        double totalOrderRevenue = 0;
        for (Order order : orderArrayList) {
            totalOrderRevenue += order.getOrderPrice();
        }
        return Utility.roundTwoDecimal(totalOrderRevenue);
    }

    public void printMaxVisitorsEachAttraction() {
        for (Attraction attraction : attractionArrayList) {
            System.out.println(attraction.getMaxVisitors());
        }
    }

    public void printVisitorInformationAttractions() {
        for (Attraction attraction : attractionArrayList) {
            attraction.printDifferenceBetweenMaxAndTotalVisitors();
        }
    }

    private Attraction calculateBussiestAttraction() {
        Attraction bussiestAttraction = null;
        int totalAttractionVisitors = 0;
        try{
            for (Attraction attraction : attractionArrayList) {
                if (attraction.getTotalDayVisitors() > totalAttractionVisitors) {
                    bussiestAttraction = attraction;
                }
            }
        }catch(Exception exc){
            System.out.println("Exception inside calculateBussiestAttraction: " + exc);
        }
        return bussiestAttraction;
    }

    private Shop calculateWorstShop(){
        Shop worstShop = null;
        try{
            double totalShopRevenue = shopArrayList.get(0).getDayRevenue();
            for (Shop shop : shopArrayList) {
                if (shop.getDayRevenue() < totalShopRevenue) {
                    worstShop = shop;
                }
            }

        }
        catch(Exception exc){
            System.out.println("Exception inside calculateWorstShop: " + exc);
        }
        return worstShop;
    }

    public double getTotalShopsDayRevenue() {
        return calculateTotalShopsDayRevenue();
    }

    public double getTotalRevenue() {
        return calculateTotalOrderRevenue() + calculateTotalShopsDayRevenue();
    }

    protected ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    protected ArrayList<Attraction> getAttractionArrayList() {
        return attractionArrayList;
    }

    protected ArrayList<Shop> getShopArrayList() {
        return shopArrayList;
    }

    protected Attraction getBussiestAttraction() {
        return calculateBussiestAttraction();
    }

    protected Shop getWorstShop() {
        return calculateWorstShop();
    }


}
