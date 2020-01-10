package shops;

import identifiers.Identifiable;

public abstract class Shop implements Identifiable {

        private double itemPricing;


    public Shop(double itemPricing) {
        this.itemPricing = itemPricing;
    }

    @Override
    public abstract String getIdentifier();
}
