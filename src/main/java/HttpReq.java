import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Created by InvincibleDudu on 10/22/2020 at 14:41
 */
public class HttpReq {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI("https://postman-echo.com/post"))
                .uri(new URI("https://192.168.244.144:443/admin/api/v2/auth/fetchToken"))
                .headers("Content-Type", "text/plain;charset=UTF-8")
//                .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
                .POST(HttpRequest.BodyPublishers.ofString("""
                        {
                         "loginId" : "lvyang",
                         "password" : "flenhplmMnTjEKUGfqBRE11r1Xik1odP2qqGfdHHlov/o+PDchh3s4Jf2ziLXw0pY0XiOCSTfi9u5/1+LiSAuwVcb2kwO2G/Pt3qNSKDnW+sJeGfRBT3Ax4MFxvqcd/7Jm6qFQOE/h2IDmhHK9xmaBMpx1cWoWFLqBEA9UYbVT4=",
                         "loginType" : "30"
                        }"""))
                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient()
//                .send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        HttpHeaders responseHeaders = response.headers();
        System.out.println(response);
        System.out.println(responseHeaders);
    }
}
