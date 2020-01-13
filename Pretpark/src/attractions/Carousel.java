package attractions;

import exceptions.NegativeNumberException;

public class Carousel extends Attraction {
    public Carousel(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a carousel attraction.";
    }
}
