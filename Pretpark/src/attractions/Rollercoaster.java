package attractions;

import exceptions.NegativeNumberException;

public class Rollercoaster extends Attraction {
    public Rollercoaster(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a rollercoaster attraction.";
    }
}
