package codewars;

/**
 * Created by InvincibleDudu on 09/08/2020 at 15:53
 * <p>
 * My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!
 * <p>
 * In honor of my grandfather's memory we will write a function using his formula!
 * <p>
 * Take a list of ages when each of your great-grandparent died.
 * Multiply each number by itself.
 * Add them all together.
 * Take the square root of the result.
 * Divide by two.
 * Example
 * predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
 * Note: the result should be rounded down to the nearest integer.
 */
public class AgePredict {

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        // your code goes here
        return (int) (Math.sqrt(age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8))/2;
    }

    public static void main(String[] args) {
        System.out.println(predictAge(65,60,75,55,60,63,64,45));
        System.out.println(predictAge(32,54,76,65,34,63,64,45));
    }
}
