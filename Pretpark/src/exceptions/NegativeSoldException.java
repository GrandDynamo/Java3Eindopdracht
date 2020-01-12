package exceptions;

public class NegativeSoldException extends Exception {
    public NegativeSoldException(){
        super("Sold items can't be negative. 0 is the minimum.");
    }
}
