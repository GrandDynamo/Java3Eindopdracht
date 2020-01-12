package shops;

import exceptions.NegativeItemsSoldException;

public class MapShop extends Shop {

    private final double ITEM_PRICING = 1.22;
    private final String SOLD_ITEMS_NAME = "Map";
    private final String uniqueIDString;

    public MapShop(int totalDayItemsSold, int uniqueIDInt) throws NegativeItemsSoldException {
        super(totalDayItemsSold, uniqueIDInt);
        this.uniqueIDString = getClass().getSimpleName() + uniqueIDInt;
    }

    @Override
    public String toString() {
        return this.uniqueIDString;
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
