import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * Created by InvincibleDudu on 05/10/2020 at 15:54
 */
public class ActiveMQDemo {
    /**
     * 在自己的云服务器上构建一个消息队列服务，并编写下面的类的对该队列/主题进行读写操作测试
     * 验证方式：教师可以自行编写一个测试方法调用本类的的send(String)和read()方法，完成对云服务器上的队列服务操作，
     * 并能在控制台上显示读取的消息结果
     */

//向自己的云服务器的消息队列发送消息message
    public void send(String message) throws JMSException {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://47.115.53.242:61616/");
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("test-queue");
        MessageProducer producer = session.createProducer(queue);
        TextMessage textMessage = session.createTextMessage(message);
        producer.send(textMessage);
        producer.close();
        session.close();
        connection.close();
    }

    public void read() throws JMSException, IOException {
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory("tcp://47.115.53.242:61616");
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("test-queue");
        MessageConsumer consumer = session.createConsumer(queue);
        consumer.setMessageListener(new MessageListener() {
            public void onMessage(Message message) {
                TextMessage textMessage=(TextMessage)message;
                try {
                    System.out.println("接收到消息："+textMessage.getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }}
        });
        System.in.read();
        consumer.close();
        session.close();
        connection.close();
    }

}

