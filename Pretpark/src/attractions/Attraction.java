package attractions;

import exceptions.NegativeNumberException;
import exceptions.ToManyVisitorsException;
import identifiers.Stringable;

public abstract class Attraction implements Stringable {
    private final int MINUTES_IN_DAY = 1440;
    private int totalDayVisitors;
    private final int  MINUTES_BETWEEN_RIDE;
    private final int MAX_PEOPLE_IN_RIDE;

    public Attraction(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        if(minutesBetweenRide < 0 || maxPeopleInRide < 0){
            throw new NegativeNumberException();
        }
        this.MINUTES_BETWEEN_RIDE = minutesBetweenRide;
        this.MAX_PEOPLE_IN_RIDE = maxPeopleInRide;
    }

    /**
     * Method to set the total day visitors
     * @param totalDayVisitors
     * @throws ToManyVisitorsException
     */
    public void setTotalDayVisitors(int totalDayVisitors) throws ToManyVisitorsException {
        if (totalDayVisitors > calculateMaxVisitors()){
            throw new ToManyVisitorsException();
        }
            this.totalDayVisitors = totalDayVisitors;
    }

    /**
     * Method to calculate the max visitors the attraction can handle in one day
     * @return int max visitors
     */
    private int calculateMaxVisitors() {
        return (this.MINUTES_IN_DAY / this.MINUTES_BETWEEN_RIDE) * this.MAX_PEOPLE_IN_RIDE;
    }

    /**
     * Method to return the max visitors the attraction can handle in one day
     * @return int max visitors
     */
    public int getMaxVisitors(){
        return calculateMaxVisitors();
    }

    /**
     * Method to return the total day visitors the attraction got
     * @return int total day visitors
     */
    public int getTotalDayVisitors() {
        return totalDayVisitors;
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public abstract String toString();

    /**
     * Method to print the difference between max and total day visitors
     */
    public void printDifferenceBetweenMaxAndTotalVisitors(){
        System.out.println("Visitors: " + getTotalDayVisitors() + " / " + calculateMaxVisitors());
    }
}
