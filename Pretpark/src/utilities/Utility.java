package utilities;

public class Utility {
    public static double roundTwoDecimal(double number){
        double roundoff = Math.round(number * 100) / 100D;
        return roundoff;
    }
    public static String generateUniqueID(String typeCode){
        return typeCode + System.currentTimeMillis();
    }
}
