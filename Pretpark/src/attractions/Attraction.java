package attractions;

import identifiers.Identifiable;

public abstract class Attraction implements Identifiable {
    private static final int MINUTES_IN_DAY = 1440;
    private int totalDayVisitors;
    private int minutesBetweenRide;
    private int maxPeopleInRide;

    @Override
    public abstract String toString();

    public Attraction(int minutesBetweenRide, int maxPeopleInRide) {
        this.minutesBetweenRide = minutesBetweenRide;
        this.maxPeopleInRide = maxPeopleInRide;
    }

    public void setTotalDayVisitors(int totalDayVisitors) {
        this.totalDayVisitors = totalDayVisitors;
    }

    public int calculateMaxVisitors(int minutesBetweenRide, int maxPeopleInRide) {
        return (MINUTES_IN_DAY / minutesBetweenRide) * maxPeopleInRide;
    }
}
