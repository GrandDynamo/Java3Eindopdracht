package attraction;

public class Bumpercars extends Attraction {
    public Bumpercars(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String getIdentifier() {
        return "I am a bumpercar attraction.";
    }
}
