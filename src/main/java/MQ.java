import javax.jms.JMSException;
import java.io.IOException;

/**
 * Created by InvincibleDudu on 05/10/2020 at 12:26
 */
public class MQ {
    public static void main(String[] args) throws JMSException, IOException {
        var c = 3;
        System.out.println("Hello World!" + c);
        ActiveMQDemo a = new ActiveMQDemo();
        a.send("hello worldqweqweq");
        a.read();
    }
}
