package exceptions;

public class NegativeItemsSoldException extends Exception {
    public NegativeItemsSoldException(){
        super("Sold items can't be negative. 0 is the minimum.");
    }
}
