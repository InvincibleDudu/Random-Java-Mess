package util;

import org.apache.http.client.methods.HttpGet;
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

public class RequestUtil {
    public static final String url = "https://swapi.dev/api/people/1";
    public static final String token = "0108223bd1a8dfb1fbb973a08c2252a3";

    public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException, IOException, JSONException {
        var builder = new SSLContextBuilder().loadTrustMaterial(null, (x, y) -> true);
        var sslsf = new SSLConnectionSocketFactory(builder.build(), NoopHostnameVerifier.INSTANCE);
        var client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        var get = new HttpGet(url);
//        get.setHeader("token", );
        var response = client.execute(get);

        System.out.println(response.getStatusLine());
        var sc = new Scanner(response.getEntity().getContent());
        var sb = new StringBuilder();
        while (sc.hasNext())
            sb.append(sc.nextLine());
//        System.out.println(sb);
        var jsonObject = new JSONObject(sb.toString());
//        var s = jsonObject.getString("data");
        System.out.println(jsonObject.toString(4));
//        s = s.replaceAll("[\\[\\]\"]", "");
//        s = s.replaceAll(",", " ");
//        System.out.println(s);


    }
}
