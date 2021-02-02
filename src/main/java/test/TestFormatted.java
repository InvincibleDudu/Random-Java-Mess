package test;

/**
 * Created by InvincibleDudu on 11/23/2020 at 16:26
 */

public class TestFormatted {

    public static void main(String[] args) {
        var user = "invdu";
        var string = """
                welcome to the world
                %s
                hello there!
                """.formatted(user);
        System.out.println(string);
    }
}
