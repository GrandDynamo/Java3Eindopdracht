package shops;

public class HotdogShop extends Shop{
    public HotdogShop(double itemPricing) {
        super(itemPricing);
    }

    @Override
    public String getIdentifier() {
        return "I sell hotdogs.";
    }
}