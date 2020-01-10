package attractionn;

import identifiers.Identifiable;

public abstract class Attraction implements Identifiable {
    private int totalDayVisitors;

    @Override
    public abstract int getIdentifier();


    public int calculateMaxVisitors(){
        return 0;
    }

    public abstract int getMaxVisitors();

    public abstract void setTotalDayVisitors();
}
