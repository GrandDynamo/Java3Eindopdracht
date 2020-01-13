package exceptions;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
        super("Number can't be below 0 exception.");
    }
}
