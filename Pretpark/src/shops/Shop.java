package shops;

import identifiers.Identifiable;

public abstract class Shop implements Identifiable {

        private int totalDayItemsSold;


    public Shop(int totalDayItemsSold) {
        this.totalDayItemsSold = totalDayItemsSold;
    }

    @Override
    public abstract String getIdentifier();

    public abstract double getITEM_PRICING();

    public double getDayRevenue(){
        return getITEM_PRICING() * totalDayItemsSold;
    }
}
