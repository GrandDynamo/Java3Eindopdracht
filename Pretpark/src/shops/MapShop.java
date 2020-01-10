package shops;

public class MapShop extends Shop {
    public MapShop(double itemPricing) {
        super(itemPricing);
    }

    @Override
    public String getIdentifier() {
        return "I sell maps.";
    }
}
