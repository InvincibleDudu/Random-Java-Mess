package codewars;

/**
 * Created by InvincibleDudu on 09/08/2020 at 13:01
 * <p>
 * Task:
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * <p>
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 * Rules:
 * You need to round the answer to 2 decimal places and return it as String.
 * <p>
 * If the given value is 0 then it should return 0.00
 * <p>
 * You will only be given Natural Numbers as arguments.
 * <p>
 * Examples:
 * SeriesSum(1) => 1 = "1.00"
 * SeriesSum(2) => 1 + 1/4 = "1.25"
 * SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 */
public class NthSeries {
    public static String seriesNum(int n) {
        double result = 0.00;
//        if (n == 0)
//            return String.valueOf(result);
//        else {
            //result = 1.00;
            for (int i = 1; i <= n; i++) {
                result += 1.0 / (3 * i - 2);
//            }
        }
        return String.format("%.2f", result);

    }

    public static void main(String[] args) {
        System.out.println(seriesNum(0));
        System.out.println(seriesNum(1));
        System.out.println(seriesNum(2));
        System.out.println(seriesNum(5));
    }
}
