abstract class Vehicle {
    int numberTyres;

    abstract void start();
}

class Car extends Vehicle {
    int numberTyres = 4;

    void start() {
        System.out.println("starts with key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("starts with kick");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}
