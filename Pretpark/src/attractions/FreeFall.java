package attractions;

import exceptions.NegativeNumberException;

public class FreeFall extends Attraction {
    public FreeFall(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public  String toString() {
        return "I am a freeFall attraction.";
    }
}
