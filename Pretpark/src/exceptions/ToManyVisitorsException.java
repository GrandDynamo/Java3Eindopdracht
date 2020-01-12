package exceptions;

public class ToManyVisitorsException extends Exception {
    public ToManyVisitorsException(){
        super("Cant have more visitors than the attraction can take.");
    }
}
