package attractions;

public class FreeFall extends Attraction {
    public FreeFall(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public  String toString() {
        return "I am a freeFall attraction.";
    }
}
