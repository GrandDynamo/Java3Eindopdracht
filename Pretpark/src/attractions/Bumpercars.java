package attractions;

public class Bumpercars extends Attraction {

    // TODO: WAT DOET SUPER PRECIES?
    public Bumpercars(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public String toString() {
        return "I am a bumpercar attraction.";
    }
}
