package attraction;

public class Carousel extends Attraction {
    public Carousel(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public int getIdentifier() {
        return "I am a carousel attraction.";
    }
}
