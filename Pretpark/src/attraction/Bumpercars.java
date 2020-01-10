package attraction;

public class Bumpercars extends Attraction {
    public Bumpercars() {
    }

    @Override
    public int getIdentifier() {
        return 0;
    }

    @Override
    //TODO berkening max visitor.
    public int calculateMaxVisitors() {
        return 1;
    }

    @Override
    public int getMaxVisitors() {
        return calculateMaxVisitors();
    }

    @Override
    public void setTotalDayVisitors() {

    }
}
