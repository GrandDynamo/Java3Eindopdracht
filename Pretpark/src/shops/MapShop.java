package shops;

import exceptions.NegativeItemsSoldException;

public class MapShop extends Shop {

    private final double ITEM_PRICING = 1.22;
    private final String SOLD_ITEMS_NAME = "Map";

    public MapShop(int totalDayItemsSold) throws NegativeItemsSoldException {
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

    @Override
    public String getSOLD_ITEMS_NAME() {
        return SOLD_ITEMS_NAME;
    }
}
