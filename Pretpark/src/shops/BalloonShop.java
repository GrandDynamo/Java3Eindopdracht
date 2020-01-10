package shops;

public class BalloonShop extends Shop {
    public BalloonShop(double itemPricing) {
        super(itemPricing);
    }

    @Override
    public String getIdentifier() {
        return "I sell baloons.";
    }
}
