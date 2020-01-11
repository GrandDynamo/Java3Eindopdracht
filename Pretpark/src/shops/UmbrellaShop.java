package shops;

public class UmbrellaShop extends Shop {
    private final double ITEM_PRICING = 12.45;
    public UmbrellaShop(int totalDayItemsSold) {
        super(totalDayItemsSold);
    }

    @Override
    public String getIdentifier() {
        return "I sell umbrella's.";
    }

    @Override
    public double getITEM_PRICING() {
        return ITEM_PRICING;
    }
}
