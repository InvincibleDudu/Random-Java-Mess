package nlp;

import com.tencentcloudapi.asr.v20190614.AsrClient;
import com.tencentcloudapi.asr.v20190614.models.CreateRecTaskRequest;
import com.tencentcloudapi.asr.v20190614.models.CreateRecTaskResponse;
import com.tencentcloudapi.asr.v20190614.models.DescribeTaskStatusRequest;
import com.tencentcloudapi.asr.v20190614.models.DescribeTaskStatusResponse;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.nlp.v20190408.NlpClient;
import com.tencentcloudapi.nlp.v20190408.models.SentimentAnalysisRequest;
import com.tencentcloudapi.nlp.v20190408.models.SentimentAnalysisResponse;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

/**
 * Created by InvincibleDudu on 01/02/2021 at 16:35
 */

public class CreateRecTask {
    public static void main(String [] args) throws IOException {
        //通过本地音频方式
        try{
            //重要，此处<Your SecretId><Your SecretKey>需要替换成客户自己的账号信息，获取方法：
            //请参考接口说明（https://cloud.tencent.com/document/product/1093/37139）中的使用步骤 1 进行获取。
            Credential cred = new Credential("AKIDDD3faFqHPIuSlnpAYgYBbtujR7XShB9s", "iU7U7gJ7nFW3NXSivxjPu318l8oD2c1C");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("asr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            AsrClient client = new AsrClient(cred, "ap-shanghai", clientProfile);

//            String params = "{\"EngineModelType\":\"16k_zh\",\"ChannelNum\":1,\"ResTextFormat\":2,\"SourceType\":1}";
//            String params = "{\"EngineModelType\":\"16k_wuu-SH\",\"ChannelNum\":1,\"ResTextFormat\":2,\"SourceType\":1}";
            String params = "{\"EngineModelType\":\"16k_en\",\"ChannelNum\":1,\"ResTextFormat\":2,\"SourceType\":1}";
            CreateRecTaskRequest req = CreateRecTaskRequest.fromJsonString(params, CreateRecTaskRequest.class);
//            File file = new File("C:\\Users\\InvincibleDudu\\Documents\\Sound recordings\\Chinese.m4a");
            File file = new File("C:\\Users\\InvincibleDudu\\Documents\\Sound recordings\\English.m4a");
            FileInputStream inputFile = new FileInputStream(file);
            byte[] buffer = new byte[(int)file.length()];
            req.setDataLen(file.length());
            var read = inputFile.read(buffer);
            System.out.println("file size: " + read);
            inputFile.close();
            String encodeData = Base64.getEncoder().encodeToString(buffer);
            req.setData(encodeData);
            CreateRecTaskResponse resp = client.CreateRecTask(req);
            System.out.println(CreateRecTaskRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}

class DescribeTaskStatus {
    public static void main(String[] args) {
        try {
            //重要，此处<Your SecretId><Your SecretKey>需要替换成客户自己的账号信息，获取方法：
            //请参考接口说明（https://cloud.tencent.com/document/product/1093/37139）中的使用步骤 1 进行获取。
            Credential cred = new Credential("AKIDDD3faFqHPIuSlnpAYgYBbtujR7XShB9s", "iU7U7gJ7nFW3NXSivxjPu318l8oD2c1C");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("asr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            AsrClient client = new AsrClient(cred, "ap-shanghai", clientProfile);

//            String params = "{\"TaskId\":1055970736}";
//            String params = "{\"TaskId\":1055977019}";
//            String params = "{\"TaskId\":1055987811}";
            String params = "{\"TaskId\":1055990537}";
            DescribeTaskStatusRequest req = DescribeTaskStatusRequest.fromJsonString(params, DescribeTaskStatusRequest.class);

            DescribeTaskStatusResponse resp = client.DescribeTaskStatus(req);

//            System.out.println(DescribeTaskStatusRequest.toJsonString(resp));
            var jsonObject = new JSONObject(DescribeTaskStatusRequest.toJsonString(resp)).toString(4);
            System.out.println(jsonObject);
        } catch (TencentCloudSDKException | JSONException e) {
            System.out.println(e.toString());
        }
    }
}

class NLP {
    public static void main(String[] args) {
        try{

            Credential cred = new Credential("AKIDDD3faFqHPIuSlnpAYgYBbtujR7XShB9s", "iU7U7gJ7nFW3NXSivxjPu318l8oD2c1C");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("nlp.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            NlpClient client = new NlpClient(cred, "ap-guangzhou", clientProfile);

            SentimentAnalysisRequest req = new SentimentAnalysisRequest();
            req.setText("嗨，大家好，我是拿来到科技美学的直播间，那么今天为大家带来的是下一代的旗舰处理器的首发产品啊，全球首发的产品小米11这个时间节点相当的令人惊讶如此提前的产品啊，不知道它会带给我们什么样的体验来不废话，咱们马上开始小米11体验。");
            req.setMode("3class");

            SentimentAnalysisResponse resp = client.SentimentAnalysis(req);

            System.out.println(SentimentAnalysisResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
