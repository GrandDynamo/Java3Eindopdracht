package attractions;

public class HauntedHouse extends Attraction {
    public HauntedHouse(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a hauntedHouse attraction.";
    }
}
 