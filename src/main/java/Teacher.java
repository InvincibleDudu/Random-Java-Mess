/**
 * Created by InvincibleDudu on 08/12/2020 at 15:56
 */
public record Teacher(int age, String name) {
}






class TestRecord{
    public static void main(String[] args) {
        Teacher t = new Teacher(30, "dumb");
        System.out.println(t.name() + t.age());
    }
}