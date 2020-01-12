package exceptions;

public class NegativeIDException extends Exception {
    public NegativeIDException(){
        super("ID can't be below 0 exception.");
    }
}
