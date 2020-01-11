package shops;

import exceptions.NegativeItemsSoldException;
import identifiers.Identifiable;
import utilities.Utility;

public abstract class Shop implements Identifiable{

        private int totalDayItemsSold;
        private final String UNIQUE_SHOP_ID;

    public Shop(int totalDayItemsSold) throws NegativeItemsSoldException{
        if (totalDayItemsSold < 0 ){
            throw new NegativeItemsSoldException();
        }
        this.totalDayItemsSold = totalDayItemsSold;
        this.UNIQUE_SHOP_ID = Utility.generateUniqueID("S");
    }

    @Override
    public abstract String getIdentifier();

    public abstract double getITEM_PRICING();

    public abstract String getSOLD_ITEMS_NAME();

    public double getDayRevenue(){
        return getITEM_PRICING() * totalDayItemsSold;
    }
    public String getUniqueShopID(){
        return UNIQUE_SHOP_ID;
    }
}
