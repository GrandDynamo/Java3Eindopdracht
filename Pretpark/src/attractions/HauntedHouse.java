package attractions;

import exceptions.NegativeNumberException;

public class HauntedHouse extends Attraction {
    public HauntedHouse(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a hauntedHouse attraction.";
    }
}
 