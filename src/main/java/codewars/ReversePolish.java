package codewars;

import java.util.Stack;

/**
 * Created by InvincibleDudu on 09/09/2020 at 11:39
 * <p>
 * Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
 * <p>
 * For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
 * <p>
 * For your convenience, the input is formatted such that a space is provided between every token.
 * <p>
 * Empty expression should evaluate to 0.
 * <p>
 * Valid operations are +, -, *, /.
 * <p>
 * You may assume that there won't be exceptional situations (like stack underflow or division by zero).
 *
 *
 * Complete Time 2020-09-09 15:44:28
 */
public class ReversePolish {

    public static void main(String[] args) {
        System.out.println("3 + 4 = " + evaluate("3 4 +"));
        System.out.println(evaluate("3 2 -"));
        System.out.println(evaluate("3 2 *"));
        System.out.println(evaluate("3 2 /"));
        System.out.println(evaluate(""));
        System.out.println(evaluate("3"));
        System.out.println(evaluate("3.5"));
        System.out.println("a: " + evaluate("5 1 2 + 4 * + 3 -"));
        System.out.println("b: (21) " + evaluate("5 1 + 4 * 3 -"));
//        String s5 = "3.5";
//        String s5 = "";
//        var strings = s5.split(" ");
//        System.out.println(strings.length);
//        System.out.println(strings[0]);
//        String s3 = "";
//        String s4 = "3";
//        System.out.println(s3.length());
//        System.out.println(s4.length());
//        String s1 = "-13 43 - 27 +";
//        String s2 = "3 -42 - 2 +";
//        var s11 = s1.split(" ");
//        var s12 = s2.split(" ");
//        System.out.println(Arrays.toString(s11));
//        System.out.println(Arrays.toString(s12));
//        for (String s : s11) {
//            System.out.println(isNumber(s));
//        }
    }

    static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
//            System.out.println("Not a number");
        }
        return false;
    }

    public static double evaluate(String expr) {
        // TODO: Your awesome code here
//        var list = new ArrayList<Character>();
        Stack<Double> s = new Stack<>();
        double result = -3.2323;
        var strings = expr.split(" ");
        if (expr.length() == 0)
            return 0;
        else if (strings.length == 1)
            return Double.parseDouble(strings[0]);
        for (String string : strings) {
//            if (expr.charAt(i) >= '0' && expr.charAt(i) <= '9') {
//                list.add(expr.charAt(i));
//                s.push(expr.charAt(i));
            if (isNumber(string)) {
                s.push(Double.parseDouble(string));
            } else {
                char c = string.charAt(0);
//                if (result == -3.2323)
//                    result = s.pop();
//                System.out.println(c);
                switch (c) {
                    case '+':           //Should just push the result back to the stack
                        if (result == -3.2323)
                            result = s.pop() + s.pop();
                        else
                            result = result + s.pop();
                        break;
                    case '-':
                        if (result == -3.2323)
                            result = -s.pop() + s.pop();
                        else
                            result = result - s.pop();
                        break;
                    case '*':
                        if (result == -3.2323)
                            result = s.pop() * s.pop();
                        else
                            result = result * s.pop();
                        break;
                    case '/':
                        if (result == -3.2323)
                            result = 1 / s.pop() * s.pop();
                        else
                            result = result / s.pop();
                        break;
                }
            }
        }
        return result;
    }
}
