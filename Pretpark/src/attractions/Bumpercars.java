package attractions;

import exceptions.NegativeNumberException;

public class Bumpercars extends Attraction {

    // TODO: WAT DOET SUPER PRECIES?
    public Bumpercars(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a bumpercar attraction.";
    }
}
