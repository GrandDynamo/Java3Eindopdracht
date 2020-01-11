package utilities;

public class Utility {
    public static double roundTwoDecimal(double number){
        return Math.round(number * 100.0) / 100.0;
    }
    public static String generateUniqueID(String typeCode){
        return typeCode + System.currentTimeMillis();
    }
}
