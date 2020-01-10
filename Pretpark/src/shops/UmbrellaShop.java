package shops;

public class UmbrellaShop extends Shop {

    public UmbrellaShop(double itemPricing) {
        super(itemPricing);
    }

    @Override
    public String getIdentifier() {
        return "I sell umbrella's.";
    }
}
