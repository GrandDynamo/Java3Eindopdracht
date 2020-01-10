package shops;

import identifiers.Identifiable;

public abstract class Shop implements Identifiable {



    public Shop() {
    }

    @Override
    public abstract String getIdentifier();
}
