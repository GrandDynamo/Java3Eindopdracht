package shops;

import exceptions.NegativeSoldException;

public class UmbrellaShop extends Shop {
    private final double ITEM_PRICING = 12.45;
    private final String SOLD_ITEMS_NAME = "Umbrella";
    public UmbrellaShop(int totalDayItemsSold) throws NegativeSoldException {
        super(totalDayItemsSold);
    }

    @Override
    public String toString() {
        return "I sell umbrellas.";
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
