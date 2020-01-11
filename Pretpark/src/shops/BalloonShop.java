package shops;

public class BalloonShop extends Shop {

    private final double ITEM_PRICING = 3.35;
    private final String SOLD_ITEMS_NAME = "Balloon";

    public BalloonShop(int totalDayItemsSold) {
        super(totalDayItemsSold);
    }

    @Override
    public String getIdentifier() {
        return "I sell baloons.";
    }

    @Override
    public double getITEM_PRICING() {
        return ITEM_PRICING;
    }

    @Override
    public String getSOLD_ITEMS_NAME() {
        return SOLD_ITEMS_NAME;
    }
}
