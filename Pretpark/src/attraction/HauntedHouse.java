package attraction;

public class HauntedHouse extends Attraction {
    public HauntedHouse(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public int getIdentifier() {
        return "I am a hauntedHouse attraction.";
    }
}
 