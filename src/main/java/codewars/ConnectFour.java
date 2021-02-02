package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by InvincibleDudu on 09/23/2020 at 16:23
 */
public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {
        // return "Red" or "Yellow" or "Draw"
        var array = new int[6][7];
        for (String s : piecesPositionList) {
            var strings = s.split("_");
            switch (strings[0]){
                case "A":
                    array[0][0] = 1;
                    break;

            }
        }
        return "Draw";
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        whoIsWinner(myList);

    }
}
