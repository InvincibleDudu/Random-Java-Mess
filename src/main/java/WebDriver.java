import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Created by InvincibleDudu on 07/21/2020 at 11:33
 */
public class WebDriver {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        var web = new ChromeDriver();
//        web.get("https://www.baidu.com");
        web.get("https://192.168.244.144/admin");
        web.findElementByXPath("//*[@id=\"details-button\"]").click();
        web.findElementByXPath("//*[@id=\"proceed-link\"]").click();
        web.findElementByXPath("//*[@id=\"loginUsername\"]").sendKeys("admin");
        web.findElementByXPath("//*[@id=\"loginPassword\"]").sendKeys("123456");
        web.findElementByXPath("//*[@id=\"loginButton\"]").click();
        Thread.sleep(2000);
//        web.findElementByXPath("//*[@id=\"sysuser\"]/a").click();
        web.get("https://192.168.244.144/admin/main/home#page/sysuser");
        var code = "djcAutoCode";
        var name = "djcAutoName";
        var login = "djcLoginName";
//        for (var i = 0; i < 10; i++) {
//            Thread.sleep(2000);
//            web.findElementById("add").click();
//            web.findElementByXPath("//*[@id=\"bookorg\"]").click();
//            web.findElementByXPath("//*[@id=\"zTreeOrg_2_span\"]").click();
//            web.findElementByXPath("//*[@id=\"validateCode\"]").sendKeys(code + i);
//            web.findElementByXPath("//*[@id=\"validateName\"]").sendKeys(name + i);
//            web.findElementByXPath("//*[@id=\"validateloginname\"]").sendKeys(login + i);
//            web.findElementByXPath("//*[@id=\"validateDescription\"]").sendKeys("Auto Generated User No." + i);
//            web.findElementByXPath("//*[@id=\"formSubmit\"]").click();
//            Thread.sleep(2000);
//            var num = 100004 + i * 4;
//            System.out.println(num);
//            web.findElementByXPath("//*[@id=\"layui-layer" + num + "\"]/div[3]/a").click();
//        }
    }
}

class refreshCOD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
        var driver = new EdgeDriver();
        driver.get("https://callofduty.com/redeem");
        driver.findElementByXPath("//*[@id=\"username\"]").sendKeys("409174690@qq.com");
                                                driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("dujiachen12");
        driver.findElementByXPath("//*[@id=\"login-button\"]").click();
        Thread.sleep(12000);
        driver.findElementByXPath("//*[@id=\"code\"]").sendKeys("0MNWCHF1VMQG7");
        driver.findElementByXPath("//*[@id=\"redeem-code-button\"]").click();
        for (int i = 0; i < 50; i++) {
//            Thread.sleep(3000);
            System.out.println(i);
//            driver.navigate().
//            driver.findElementByXPath("//body").sendKeys(Keys.ESCAPE);
            driver.navigate().refresh();
        }

    }
}