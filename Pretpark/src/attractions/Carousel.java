package attractions;

public class Carousel extends Attraction {
    public Carousel(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a carousel attraction.";
    }
}
