package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by InvincibleDudu on 10/14/2020 at 16:17
 *
 * Edited on 01/29/2021 at 10:53:50
 */
public class TestList {

    public static void main(String[] args) throws JsonProcessingException {
        var list = new ArrayList<>();
        list.add(333);
        list.add("asda");
        System.out.println(list.get(0));
        var s = list.get(0);
        System.out.println(list.get(1));
//        String s2  = list.get(1);
        getList(String.valueOf(list));
        var score  = new Score(0.321, 0.84, 0.63);
        var mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(score));
    }

    static void getList(String list) {
        System.out.println("list " + list);
    }

}


@Data
@AllArgsConstructor
class Score {
    private double fluency;
    private double relevancy;
    private double finalScore;
}
