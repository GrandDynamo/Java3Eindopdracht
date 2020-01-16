package attractions;

import exceptions.NegativeNumberException;

public class HauntedHouse extends Attraction {
    public HauntedHouse(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public String toString() {
        return "I am a hauntedHouse attraction.";
    }
}
 