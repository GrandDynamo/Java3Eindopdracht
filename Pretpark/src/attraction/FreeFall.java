package attraction;

public class FreeFall extends Attraction {
    public FreeFall(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String getIdentifier() {
        return "I am a freeFall attraction.";
    }
}
