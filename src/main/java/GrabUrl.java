import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by InvincibleDudu on 10/14/2020 at 10:24
 */
public class GrabUrl {

    /**
     * 测试
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        try {
            Document doc = null;
            doc = Jsoup.connect("http://aikg.test.sstir.cn/graph?q=%E8%81%9A%E5%90%88%E6%A8%A1%E5%9E%8B&id=CT200035074&type=1&qt=SUBJECT").get();
            // dom解析获得指定元素
            org.jsoup.select.Elements mainArea = doc.getElementsByClass("circle-element");
            // 遍历Elements datas，获取指定属性
            for (Element data : mainArea) {
                //str.add((String)data.);
            }

        } catch (IOException e) {
            System.out.println("以上地址未获取到页面");
            e.printStackTrace();

        }
        /*for(int i=0;i<str.size();i++){

        }*/
        System.out.println(str);
    }

}


