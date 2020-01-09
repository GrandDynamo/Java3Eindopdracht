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
    }

    public void addOrder(int orderId) {
        orderList.add(new Order(orderId));
    }

    public void addAttraction(Attraction attraction){
        attractionList.add(attraction);
    }
}
