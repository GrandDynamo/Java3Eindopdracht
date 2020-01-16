package shops;

import exceptions.NegativeSoldException;
import identifiers.Stringable;

public abstract class Shop implements Stringable {

        private int totalDayItemsSold;

    public Shop(int totalDayItemsSold) throws NegativeSoldException {
        if (totalDayItemsSold < 0) {
            throw new NegativeSoldException();
        }
        this.totalDayItemsSold = totalDayItemsSold;
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public abstract String toString();

    /**
     * Method to return the sold item's pricing
     * @return double item price
     */
    public abstract double getITEM_PRICING();

    /**
     * Method to return the sold item's name
     * @return String sold item's name
     */
    public abstract String getSOLD_ITEMS_NAME();

    /**
     * Method to return the total day revenue
     * @return double day revenue
     */
    public double getDayRevenue(){
        return getITEM_PRICING() * totalDayItemsSold;
    }
}
