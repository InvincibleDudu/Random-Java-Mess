import javax.swing.*;
import java.awt.*;

/**
 * Created by InvincibleDudu on 08/11/2020 at 11:04
 */
public class UseButtonEvent {
    public static void main(String[] args) {
        JFrame frm = new JFrame("理解事件");
        frm.setLayout(new BorderLayout());

        // 创建按钮对象和注册监听器进行授权,参数为事件处理者对象
        JButton btn = new JButton("请单击本按钮");
        frm.getContentPane().add(btn);
//        ButtonHandler btnHandler = new ButtonHandler( (ActionEvent e) -> System.out.println("发生了单击！"));
        btn.addActionListener(x -> System.out.println("Click!"));    //与点击事件相关的授权处理的方法

        frm.setBounds(400, 200, 400, 200);
        frm.setVisible(true);
    }
}

//实现点击事件监听器接口,成为点击事件ActionEvent的处理者
//class ButtonHandler implements ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("发生了单击");
//    }
//}
