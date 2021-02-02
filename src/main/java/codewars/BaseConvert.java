package codewars;

/**
 * Created by InvincibleDudu on 09/17/2020 at 11:20
 */
public class BaseConvert {
    public static String baseConversion(String number, int sBase, int dBase)
    {
        // Parse the number with source radix
        // and return in specified radix(base)
        
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }


    public static void main(String[] args) {
        String number = "555"; // Number
        int sBase = 8; // Source Base Octal
        int dBase = 10; // Destination Base Decimal
        System.out.println("Octal to Decimal: "
                + baseConversion(number, 17, dBase));
        dBase = 16; // Destination Base Hexadecimal
        System.out.println(baseConversion(number, 30, dBase));
        System.out.println(baseConversion("AA", 30, dBase));
    }
}
