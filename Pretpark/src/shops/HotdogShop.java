package shops;

import exceptions.NegativeSoldException;

public class HotdogShop extends Shop{
    private final double ITEM_PRICING = 4.20;
    private final String SOLD_ITEMS_NAME = "Hot Dog";

    public HotdogShop(int totalDayItemsSold) throws NegativeSoldException {
        super(totalDayItemsSold);
    }

    @Override
    public String toString() {
        return "I sell Hotdogs";
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