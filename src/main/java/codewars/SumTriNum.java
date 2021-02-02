package codewars;

/**
 * Created by InvincibleDudu on 09/08/2020 at 15:33
 */
public class SumTriNum {
    public static int sumTriangularNumbers(int n) {
        if (n <= 0)
            return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1) * 0.5;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(6));
        System.out.println(sumTriangularNumbers(34));

    }
}
