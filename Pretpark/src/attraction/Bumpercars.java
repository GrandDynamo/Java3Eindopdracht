package attraction;

public class Bumpercars extends Attraction {

    // TODO: WAT DOET SUPER PRECIES?
    public Bumpercars(int minutesBetweenRide, int maxPeopleInRide) {
        super(minutesBetweenRide, maxPeopleInRide);
    }

    @Override
    public int getIdentifier() {
        return "I am a bumpercar attraction.";
    }
}
