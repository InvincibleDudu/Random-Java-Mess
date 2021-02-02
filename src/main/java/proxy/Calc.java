package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by InvincibleDudu on 08/12/2020 at 13:52
 * <p>
 * 在不修改Division类的定义前提下，请用动态代理的方式编写一个代理程序进行除法计算。要求
 * 1、编写一个动态代理处理器类，扩展除法功能如下：
 * a.在除法计算前，可以检验除数是否为0，如果为0，则计算结果为-9999，并输出错误提示：除零错误！
 * b.在除法计算后，可以检查是否有余数，如果有余数，则输出余数提示：余数为xxx
 * 2、编写一个测试类，从键盘输入两个数，生成动态代理对象，通过代理对象进行除法计算，并输出最终结果。
 * 3、编写其他可能需要的接口。
 * 4、将动态代理、测试类、相应接口的代码直接拷贝到答题文本框中去。不要上传附件。
 */
public interface Calc {
    int divide(int a, int b);

}

class Division implements Calc {
    public int divide(int a, int b) {
        int result = -1;
        try {
            System.out.println("开始计算.....");
            result = a / b;
            System.out.println("计算完毕.....");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

@SuppressWarnings("SuspiciousInvocationHandlerImplementation")
class DivisionProxyHandler implements InvocationHandler {

    Object object;

    public DivisionProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        int result = -9999;
        if ((int) args[1] == 0) {
            System.out.println("除零错误！");
            return result;
        } else {
            result = (int) method.invoke(object, args);
        }
        if ((int) args[0] % (int) args[1] != 0) {
            System.out.println("余数为" + (int) args[0] % (int) args[1]);
        }
        return result;
    }
}

class TestDivision {
    public static void main(String[] args) {
        InvocationHandler h = new DivisionProxyHandler(new Division());
        Calc c = (Calc) Proxy.newProxyInstance(Division.class.getClassLoader(), Division.class.getInterfaces(), h);
        System.out.println(c.divide(17, 2) + "\n");
        System.out.println(c.divide(17, 0) + "\n");
        System.out.println(c.divide(17, 7) + "\n");
        System.out.println(c.divide(14, 7) + "\n");
    }
}