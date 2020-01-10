package attraction;

public class HauntedHouse extends Attraction {
    public HauntedHouse(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String getIdentifier() {
        return "I am a hauntedHouse attraction.";
    }
}
 