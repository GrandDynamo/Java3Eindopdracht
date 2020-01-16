package shops;

import exceptions.NegativeSoldException;

public class HotdogShop extends Shop{
    private final double ITEM_PRICING = 4.20;
    private final String SOLD_ITEMS_NAME = "Hot Dog";

    public HotdogShop(int totalDayItemsSold) throws NegativeSoldException {
        super(totalDayItemsSold);
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public String toString() {
        return "I sell Hotdogs";
    }

    /**
     * Method to return the sold item's pricing
     * @return double item price
     */
    @Override
    public double getITEM_PRICING() {
        return ITEM_PRICING;
    }

    /**
     * Method to return the sold item's name
     * @return String sold item's name
     */
    @Override
    public String getSOLD_ITEMS_NAME() {
        return SOLD_ITEMS_NAME;
    }
}