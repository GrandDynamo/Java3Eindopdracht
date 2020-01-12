package shops;

import exceptions.NegativeItemsSoldException;
import identifiers.Stringable;

public abstract class Shop implements Stringable {

        private int totalDayItemsSold;

    public Shop(int totalDayItemsSold) throws NegativeItemsSoldException{
        if (totalDayItemsSold < 0 ){
            throw new NegativeItemsSoldException();
        }
        this.totalDayItemsSold = totalDayItemsSold;
    }

    @Override
    public abstract String toString();

    public abstract double getITEM_PRICING();

    public abstract String getSOLD_ITEMS_NAME();

    public double getDayRevenue(){
        return getITEM_PRICING() * totalDayItemsSold;
    }
}
