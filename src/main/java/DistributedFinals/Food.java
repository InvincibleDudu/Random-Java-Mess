package DistributedFinals;

/**
 * Created by InvincibleDudu on 08/31/2020 at 13:19
 */
public interface Food {
    void eat();
}

class Beef implements Food {
    @Override
    public void eat() {
        System.out.println("吃牛排。。。");
    }
}

class Salad implements Food {
    @Override
    public void eat() {
        System.out.println("吃沙拉。。。");
    }
}

