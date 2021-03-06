package attractions;

import exceptions.NegativeNumberException;

public class Carousel extends Attraction {
    public Carousel(int minutesBetweenRide, int maxPeopleInRide) throws NegativeNumberException {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    /**
     * Method to return the type of object.
     * @return String type of object
     */
    @Override
    public String toString() {
        return "I am a carousel attraction.";
    }
}
