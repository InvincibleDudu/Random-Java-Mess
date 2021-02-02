package codewars;

/**
 * Created by InvincibleDudu on 09/08/2020 at 16:10
 * <p>
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 * <p>
 * Examples
 * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 * <p>
 * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */
public class CamelCase {
    static String toCamelCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
//                s = s.replaceFirst(String.valueOf(s.charAt(i + 1)), String.valueOf(Character.toUpperCase(s.charAt(i + 1))));
                s = s.substring(0, i) + Character.toUpperCase(s.charAt(i+1)) + s.substring(i + 1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
//                i--;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_stealth_warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_Translate"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
        String s = "abcdefg";
        s = s.replace("a", "c");
        System.out.println(s);
//        for (int i = 0; i < s.length(); i++)
//        int i = 3;
//        s = s.substring(0, i) + s.substring(i + 1);
//        System.out.println(s);

    }
}
