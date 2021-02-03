package util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by InvincibleDudu on 01/25/2021 at 15:13
 */

public class BaiduUtil {

    static AipNlp client = new AipNlp("23586583", "AGRa6EYmIWvehfHhGcHG9F4W", "*");


    public static void main(String[] args) throws JSONException {
        sample("大家点一下上面的小程序看看是否有页面里显示不完整的");
    }

    public static void sample(String text) throws JSONException {
        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        System.out.println(text.length());

        if (text.length() > 128) {
            var sub1 = text.substring(0, 80);
            var sub2 = text.substring(80);
            var s = sub2.split("。", 2);
            sub1 = sub1.concat(s[0]);
            sub2 = s[1];
//            for (var a : s) {
                System.out.println(sub1 + "\n" + sub2);
                JSONObject res = client.dnnlmCn(sub1, options);
                System.out.println(res.toString(2));
                JSONObject res2 = client.dnnlmCn(sub2, options);
                System.out.println(res2.toString(2));
//            }
        } else {

            // DNN语言模型
            JSONObject res = client.dnnlmCn(text, options);
            System.out.println(res.toString(2));
        }
    }
}
