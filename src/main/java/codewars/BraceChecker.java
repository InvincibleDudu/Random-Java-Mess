package codewars;

import java.util.Stack;

/**
 * Created by InvincibleDudu on 09/09/2020 at 10:09
 * <p>
 * Write a function that takes a string of braces, and determines if the order of the braces is valid.
 * It should return true if the string is valid, and false if it's invalid.
 * <p>
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
 * <p>
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * <p>
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * <p>
 * Examples
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 * <p>
 * Forfeited
 */
public class BraceChecker {

    public static boolean isValid(String braces) {
        // Add code here
//        for (int i = 0; i < braces.length(); i++) {
//            if (braces.charAt(i) == '(') {
//                for (int j = i; j < braces.length(); j++) {
//                    if (braces.charAt(j) == ')')
//                        return true;
//                }
//            }
//        }
        Stack<Character> s = new Stack<>();
        char[] charArray = braces.toCharArray();
        for (char c : charArray) {
            if (!s.isEmpty() && isClosing(s.peek(), c))
                s.pop();
            else
                s.push(c);
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{}[()]"));
        System.out.println(isValid("{}[)]"));
        System.out.println(isValid("()("));
        System.out.println(isValid("("));
    }

    public static boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }
}
