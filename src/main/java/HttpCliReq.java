import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by InvincibleDudu on 10/29/2020 at 13:44
 */
public class HttpCliReq {
    public static final String url = "https://api.ip138.com/ipv4/";
    public static final String token = "*";
    public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException, IOException, JSONException {
        var id = "9a593592-887d-4615-a438-c1e632f3a677";
//        var id = "1450a7dd-b6f9-4cec-b336-d030930f15b1";
//        var token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpbklkIjoibHZ5YW5nIiwibG9naW5UeXBlIjoiMTAiLCJuYW1lIjoi5ZCV5rSLIiwidXNlckVtYWlsIjoibHZ5YW5nQGVjY29tLmNvbS5jbiIsImlkIjoiOWE1OTM1OTItODg3ZC00NjE1LWE0MzgtYzFlNjMyZjNhNjc3IiwiZXhwIjoxNjA0MDM4Mzc1LCJvcmdJZCI6IjcwYjU0ZDg0LTZkMGQtNDRkZi04MjQ1LThmYTY2OTk0NTEwNSIsInRlbmFudCI6IjMxNTJhMTg5LTk4YzItMTFlYS1hN2IxLTAwNTA1NjhlNGEyZCJ9.ozuAqvJQ9AUW1y5K6zqLn4PxuG0hH5a_j3G_ziC89yw";
        var builder = new SSLContextBuilder().loadTrustMaterial(null, (x, y) -> true);
        var sslsf = new SSLConnectionSocketFactory(builder.build(), NoopHostnameVerifier.INSTANCE);
        var client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        var get = new HttpGet(url + "?ip=69.171.251.11");
        get.setHeader("token", token);
        var response = client.execute(get);

        System.out.println(response.getStatusLine());
        var sc = new Scanner(response.getEntity().getContent());
        var sb = new StringBuilder();
        while (sc.hasNext())
            sb.append(sc.nextLine());
        System.out.println(sb);
        var jsonObject = new JSONObject(sb.toString());
        var s = jsonObject.getString("data");
        System.out.println(s);
        s = s.replaceAll("[\\[\\]\"]", "");
        s = s.replaceAll(",", " ");
        System.out.println(s);
    }
}
