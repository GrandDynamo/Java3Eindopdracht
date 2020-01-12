package shops;

import exceptions.NegativeItemsSoldException;
import identifiers.Identifiable;
import utilities.Utility;

public abstract class Shop implements Identifiable{

        private int totalDayItemsSold;
        private final String UNIQUE_SHOP_ID;

    public Shop(int totalDayItemsSold, int uniqueIDInt) throws NegativeItemsSoldException{
        if (totalDayItemsSold < 0 ){
            throw new NegativeItemsSoldException();
        }
        this.totalDayItemsSold = totalDayItemsSold;
        this.UNIQUE_SHOP_ID = Utility.generateUniqueID("S");
    }

    @Override
    public abstract String toString();

    public abstract double getITEM_PRICING();

    public abstract String getSOLD_ITEMS_NAME();

    public double getDayRevenue(){
        return getITEM_PRICING() * totalDayItemsSold;
    }
}
