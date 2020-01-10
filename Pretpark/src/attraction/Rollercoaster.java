package attraction;

public class Rollercoaster extends Attraction {
    public Rollercoaster(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String getIdentifier() {
        return "I am a rollercoaster attraction.";
    }
}
