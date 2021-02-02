package IOC;

/**
 * Created by InvincibleDudu on 08/11/2020 at 15:32
 */
public interface Food {
    void eat();
}

class Beef implements Food {
    @Override
    public void eat() {
        System.out.println("吃牛排...");
    }
}

class Salad implements Food {
    @Override
    public void eat() {
        System.out.println("吃沙拉...");
    }
}

class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("吃披萨...");
    }
}