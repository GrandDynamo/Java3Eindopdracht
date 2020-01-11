package shops;

public class HotdogShop extends Shop{
    private final double ITEM_PRICING = 4.20;
    public HotdogShop(int totalDayItemsSold) {
        super(totalDayItemsSold);
    }

    @Override
    public String getIdentifier() {
        return "I sell hotdogs.";
    }

    @Override
    public double getITEM_PRICING() {
        return ITEM_PRICING;
    }
}