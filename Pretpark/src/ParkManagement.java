import attractions.Attraction;
import shops.*;
import utilities.Utility;

import java.util.ArrayList;

public class ParkManagement {
    private ArrayList<Order> orderArrayList;
    private ArrayList<Attraction> attractionArrayList;
    private ArrayList<Shop> shopArrayList;

    public ParkManagement() {
        orderArrayList = new ArrayList<>();
        attractionArrayList = new ArrayList<>();
        shopArrayList = new ArrayList<>();
    }

    /**
     * Adds an order to the orderArrayList.
     *
     * @param order
     */
    public void addOrder(Order order) {
        orderArrayList.add(order);
    }

    /**
     * Adds an attraction to the attractionArrayList.
     *
     * @param attraction
     */
    public void addAttraction(Attraction attraction) {
        attractionArrayList.add(attraction);
    }

    /**
     * Adds a shop to the shopArrayList.
     *
     * @param shop
     */
    public void addShop(Shop shop) {
        shopArrayList.add(shop);
    }

    /**
     * Calculates the rounded total shop revenues combined.
     *
     * @return totalShopsRevenue
     */
    private double calculateTotalShopsDayRevenue() {
        double totalShopsRevenue = 0;
        for (Shop shop : shopArrayList) {
            totalShopsRevenue += shop.getDayRevenue();
        }
        return Utility.roundTwoDecimal(totalShopsRevenue);
    }

    /**
     * Calculates the rounded total revenue of the park from orders.
     *
     * @return totalOrderRevenue
     */
    private double calculateTotalOrderRevenue() {
        double totalOrderRevenue = 0;
        for (Order order : orderArrayList) {
            totalOrderRevenue += order.getOrderPrice();
        }
        return Utility.roundTwoDecimal(totalOrderRevenue);
    }
    
    /**
     * Calculates the attracties that had the most amount of visitors.
     *
     * @return bussiestAttraction
     */
    private Attraction calculateBussiestAttraction() {
        Attraction bussiestAttraction = null;
        int totalAttractionVisitors = 0;
        try {
            for (Attraction attraction : attractionArrayList) {
                if (attraction.getTotalDayVisitors() > totalAttractionVisitors) {
                    bussiestAttraction = attraction;
                }
            }
        } catch (Exception exc) {
            System.out.println("Exception inside calculateBussiestAttraction: " + exc);
        }
        return bussiestAttraction;
    }

    /**
     * Calculates the shop who has the least amount of revenue.
     *
     * @return worstShop
     */
    private Shop calculateWorstShop() {
        Shop worstShop = null;
        try {
            double totalShopRevenue = shopArrayList.get(0).getDayRevenue();
            for (Shop shop : shopArrayList) {
                if (shop.getDayRevenue() < totalShopRevenue) {
                    worstShop = shop;
                }
            }

        } catch (Exception exc) {
            System.out.println("Exception inside calculateWorstShop: " + exc);
        }
        return worstShop;
    }

    /**
     * Prints the real visitor count and max visitor count of each attraction.
     */
    public void printVisitorInformationAttractions() {
        for (Attraction attraction : attractionArrayList) {
            attraction.printDifferenceBetweenMaxAndTotalVisitors();
        }
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
