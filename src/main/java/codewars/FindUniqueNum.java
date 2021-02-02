package codewars;

/**
 * Created by InvincibleDudu on 09/11/2020 at 11:38
 *
 * 6kyu
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 *
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains at least 3 numbers.
 *
 * The tests contain some very huge arrays, so think about performance.
 *
 *
 * Turned out this is actually a decent solution,
 * Instead of sorting the array first which makes TC O(logn), this is only O(n)
 *
 */
public class FindUniqueNum {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{3,3,3,3,3,3,7,3,3,3,3}));
        System.out.println(findUniq(new double[]{1, 1, 2, 1, 1, 1}));
    }

    public static double findUniq(double[] arr) {
        // Do the magic
        if (arr[0] != arr[1]) {
            if (arr[1] != arr[2] && arr[0] == arr[2])
                return arr[1];
            else
                return arr[0];
        }
//        if (arr[0] == arr[1]) {
        else{
            for (double v : arr) {
                if (v != arr[0])
                    return v;
            }
        }
        return arr[0];
    }
}
