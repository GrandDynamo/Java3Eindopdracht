package shops;

import exceptions.NegativeItemsSoldException;

public class UmbrellaShop extends Shop {
    private final double ITEM_PRICING = 12.45;
    private final String SOLD_ITEMS_NAME = "Umbrella";
    public UmbrellaShop(int totalDayItemsSold) throws NegativeItemsSoldException {
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

    @Override
    public String getSOLD_ITEMS_NAME() {
        return SOLD_ITEMS_NAME;
    }
}
