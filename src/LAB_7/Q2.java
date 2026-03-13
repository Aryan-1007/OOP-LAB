package LAB_7;

class Vehicle {
    protected String name;
    protected int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        if (maxSpeed <= 0)
            throw new IllegalArgumentException("Speed must be positive");
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        System.out.println(name + " Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle {
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
}

class Scooter extends Vehicle {
    public Scooter(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
}

public class Q2 {
    public static void main(String[] args) {
        try {
            Vehicle car = new Car("Car", 180);
            Vehicle bicycle = new Bicycle("Bicycle", 40);
            Vehicle scooter = new Scooter("Scooter", 90);

            car.maxSpeed();
            bicycle.maxSpeed();
            scooter.maxSpeed();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}