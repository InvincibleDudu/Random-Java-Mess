package codewars;

/**
 * Created by InvincibleDudu on 09/21/2020 at 16:45
 * <p>
 * 5kyu
 * <p>
 * Implement a function that receives two IPv4 addresses,
 * <p>
 * and returns the number of addresses between them (including the first one, excluding the last one).
 * <p>
 * All inputs will be valid IPv4 addresses in the form of strings.
 * <p>
 * The last address will always be greater than the first one.
 * <p>
 * Examples:
 * <p>
 * ips_between("10.0.0.0", "10.0.0.50")  ==   50
 * <p>
 * ips_between("10.0.0.0", "10.0.1.0")   ==  256
 * <p>
 * ips_between("20.0.0.10", "20.0.1.0")  ==  246
 * <p>
 * Completed 09-21 17:15:55
 * <p>
 * Refactored Completed 09-21 17:34:34
 */
public class CountIP {

    public static long ipsBetween(String start, String end) {
        var aStart = start.split("\\.");
        var aEnd = end.split("\\.");
        var result = 0;
        for (int i = 0; i < 4; i++) {
            if (!aStart[i].equals(aEnd[i])) {
//                switch (i) {
//                    case 0:
//                        return compare(aStart[i], aEnd[i], i) + compare(aStart[1], aEnd[1], 1) + compare(aStart[2], aEnd[2], 2) + compare(aStart[3], aEnd[3], 3);
//                    case 1:
//                        return compare(aStart[i], aEnd[i], i) + compare(aStart[2], aEnd[2], 2) + compare(aStart[3], aEnd[3], 3);
//                    case 2:
//                        return compare(aStart[i], aEnd[i], i) + compare(aStart[3], aEnd[3], 3);
//                    default:
//                        return compare(aStart[i], aEnd[i], i);
//                }
                for (int j = i; j < 4; j++)
                    result += compare(aStart[j], aEnd[j], j);
                break;
            }
        }
        return result;
    }

    static int compare(String a, String b, int i) {
        return (int) (Math.pow(256, 3 - i)) * (Integer.parseInt(b) - Integer.parseInt(a));
    }

    public static void main(String[] args) {
//        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
    }
}
