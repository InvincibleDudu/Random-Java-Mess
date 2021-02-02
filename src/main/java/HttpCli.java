import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by InvincibleDudu on 10/22/2020 at 15:30
 */
public class HttpCli {
    public static void main(String[] args) throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        var builder = new SSLContextBuilder().loadTrustMaterial(null, (x, y) -> true);
//        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy() {
//            @Override
//            public boolean isTrusted(X509Certificate[] chain, String authType) {
//                return true;
//            }
//        });
//        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(
//                sslsf).setSSLHostnameVerifier( NoopHostnameVerifier.INSTANCE).build();
//        var sslsf = new SSLConnectionSocketFactory(builder.build());
//        var sslsf = new SSLConnectionSocketFactory(builder.build(), SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        var sslsf = new SSLConnectionSocketFactory(builder.build(), NoopHostnameVerifier.INSTANCE);
//        var client = HttpClientBuilder.create().build();
//        var client = HttpClients.custom().setSSLSocketFactory(sslsf).setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build();
        var client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        var post = new HttpPost("https://192.168.244.144:443/admin/api/v2/auth/fetchToken");
//        var response = client.execute(new HttpPost("https://192.168.244.144:443/admin/api/v2/auth/fetchToken"));
//        var response = client.execute(new HttpGet("https://invdu.top/"));
//        client.execute(new HttpPost());
//        String json = "{"id":1,"name":"John"}";
        @SuppressWarnings("SpellCheckingInspection") String json = """
                {
                 "loginId" : "lvyang",
                 "password" : "flenhplmMnTjEKUGfqBRE11r1Xik1odP2qqGfdHHlov/o+PDchh3s4Jf2ziLXw0pY0XiOCSTfi9u5/1+LiSAuwVcb2kwO2G/Pt3qNSKDnW+sJeGfRBT3Ax4MFxvqcd/7Jm6qFQOE/h2IDmhHK9xmaBMpx1cWoWFLqBEA9UYbVT4=",
                 "loginType" : "30"
                }""";
//        json = "{" +
//                "}";
        var entity = new StringEntity(json);
        post.setEntity(entity);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");
        var response = client.execute(post);
//        System.out.println(response.getEntity().getContent().toString());
//        System.out.println(response.getStatusLine().getStatusCode());
//        System.out.println(response);
        System.out.println("Status: " + response.getStatusLine());
        var sc = new Scanner(response.getEntity().getContent());
        while (sc.hasNext())
            System.out.println(sc.nextLine());
    }
}
