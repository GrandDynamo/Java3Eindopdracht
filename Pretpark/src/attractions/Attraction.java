package attractions;

import exceptions.ToManyVisitorsException;
import identifiers.Stringable;

public abstract class Attraction implements Stringable {
    private final int MINUTES_IN_DAY = 1440;
    private int totalDayVisitors;
    private final int  MINUTES_BETWEEN_RIDE;
    private final int MAX_PEOPLE_IN_RIDE;

    public Attraction(int minutesBetweenRide, int maxPeopleInRide) {
        this.MINUTES_BETWEEN_RIDE = minutesBetweenRide;
        this.MAX_PEOPLE_IN_RIDE = maxPeopleInRide;
    }

    public void setTotalDayVisitors(int totalDayVisitors)throws ToManyVisitorsException {
        if (totalDayVisitors > calculateMaxVisitors()){
            throw new ToManyVisitorsException();
        }
            this.totalDayVisitors = totalDayVisitors;
    }

    private int calculateMaxVisitors() {
        return (this.MINUTES_IN_DAY / this.MINUTES_BETWEEN_RIDE) * this.MAX_PEOPLE_IN_RIDE;
    }

    public int getMaxVisitors(){
        return calculateMaxVisitors();
    }

    @Override
    public abstract String toString();

    public void printDifferenceBetweenMaxAndTotalVisitors(){
        System.out.println("Visitors: " + this.totalDayVisitors + " / " + calculateMaxVisitors());
    }
}
