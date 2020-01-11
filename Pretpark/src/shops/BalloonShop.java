package shops;

public class BalloonShop extends Shop {

    private final double ITEM_PRICING = 3.35;

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
}
