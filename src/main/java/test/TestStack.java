package test;

import java.util.Stack;

/**
 * Created by InvincibleDudu on 09/09/2020 at 10:35
 */
public class TestStack {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("aa");
        s.push("bb");
        s.push("cc");
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}
