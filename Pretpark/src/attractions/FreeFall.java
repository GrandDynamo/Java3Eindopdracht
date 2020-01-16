package attractions;

import exceptions.NegativeNumberException;

public class FreeFall extends Attraction {
    public FreeFall(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public  String toString() {
        return "I am a freeFall attraction.";
    }
}
