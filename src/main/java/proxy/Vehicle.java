package proxy;

/**
 * Created by InvincibleDudu on 08/12/2020 at 11:21
 */
public interface Vehicle {
    void drive();
}

class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car Spins...");
    }
}

class Train implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Train Derails...");
    }
}

class Airplane implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Airplane Crashes...");
    }
}