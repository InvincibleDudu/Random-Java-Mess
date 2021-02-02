/**
 * Created by InvincibleDudu on 08/25/2020 at 15:40
 */
public class Stat {

    public static void main(String[] args) {
        StaticClass.stadic(3);
//        StaticClass.nonStatic(3);
        var stat = new StaticClass();
        stat.nonStatic(5);
        System.out.println(stat.b);
        System.out.println(StaticClass.c);
        StaticClass.c = "changed";
        System.out.println(StaticClass.c);
//        StaticClass.a = "cannot change";
        StaticClass.print();
        stat.print2();

    }
}


class StaticClass{
    public static final String a = "Static Final String";
    public String b = "String";
    public static String c = "Static String";

    public void nonStatic(int a){
        System.out.println("Non-static: " + a);
    }

    public static void stadic(int a){
        System.out.println("Static: " + a);
    }

    public static void print(){
        System.out.println(c);
    }

    public void print2(){
        System.out.println(c);
    }

}