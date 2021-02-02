package bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by InvincibleDudu on 08/11/2020 at 13:42
 */

@Data
@NoArgsConstructor
public class Student {
    private int age;
    private String name;
    String[] s;

    public Student(String[] s) {
        this.s = s;
    }

    public Student(int age) {
        this.age = age * 10;
        System.out.println("Invoking constructor with only 1 arg");
    }

    public Student(int age, String name) {
        this.age = age * 10;
        this.name = name.concat("!!!");
        System.out.println("Invoking constructor with 2 args");
    }

    public String testStudent(int age, String name) {
        return "Invoke success: " + age + " " + name + " " + this.age + " " + this.name;
    }
}
