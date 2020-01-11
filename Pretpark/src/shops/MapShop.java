package shops;

public class MapShop extends Shop {

    private final double ITEM_PRICING = 1.22;

    public MapShop(int totalDayItemsSold) {
        super(totalDayItemsSold);
    }

    @Override
    public String getIdentifier() {
        return "I sell maps.";
    }

    @Override
    public double getITEM_PRICING() {
        return ITEM_PRICING;
    }
}
