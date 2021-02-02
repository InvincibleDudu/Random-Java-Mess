package codewars;

/**
 * Created by InvincibleDudu on 09/10/2020 at 15:08
 *
 * 6kyu
 * Implement a function likes :: [String] -> String, which must take in input array, containing the names of people
 * who like an item. It must return the display text as shown in the examples:
 *
 * likes {} // must be "no one likes this"
 * likes {"Peter"} // must be "Peter likes this"
 * likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
 * likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
 * likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 *
 * Well this was ez. 2020-09-10 15:30
 */
public class WhoLikesIt {
    public static void main(String[] args) {

    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
//        switch (names.length) {
        //            System.out.println(names[0]);
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
//        }
    }
}
