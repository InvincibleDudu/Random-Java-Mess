//import org.apache.http.config.Registry;
//import org.apache.http.config.RegistryBuilder;
//import org.apache.http.conn.socket.ConnectionSocketFactory;
//import org.apache.http.conn.socket.PlainConnectionSocketFactory;
//import org.apache.http.conn.ssl.NoopHostnameVerifier;
//import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
//import org.apache.http.conn.ssl.TrustStrategy;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
//import org.apache.http.ssl.SSLContexts;
//import org.openqa.selenium.remote.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//import org.junit.jupiter.api.Test;
//
//import javax.net.ssl.SSLContext;
//import java.security.GeneralSecurityException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class HttpCliTest {
//
//    @Test
//    public final void givenAcceptingAllCertificates_whenHttpsUrlIsConsumed_thenOk()
//            throws GeneralSecurityException {
//        TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
//        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
//        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,
//                NoopHostnameVerifier.INSTANCE);
//
//        Registry<ConnectionSocketFactory> socketFactoryRegistry =
//                RegistryBuilder.<ConnectionSocketFactory> create()
//                        .register("https", sslsf)
//                        .register("http", new PlainConnectionSocketFactory())
//                        .build();
//
//        BasicHttpClientConnectionManager connectionManager =
//                new BasicHttpClientConnectionManager(socketFactoryRegistry);
//        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf)
//                .setConnectionManager(connectionManager).build();
//
//        HttpComponentsClientHttpRequestFactory requestFactory =
//                new HttpComponentsClientHttpRequestFactory(httpClient);
////        ResponseEntity<String> response = new RestTemplate(requestFactory)
////                .exchange(urlOverHttps, HttpMethod.GET, null, String.class);
////        assertThat(response.getStatusCode().value(), equalTo(200));
//    }
//}