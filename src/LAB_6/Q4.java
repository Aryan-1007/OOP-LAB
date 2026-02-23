package LAB_6;

import java.util.Scanner;

abstract class AbstractCar {
    void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }

    abstract void avg();
    abstract void model();
}

class Maruti extends AbstractCar {
    void avg() {
        System.out.println("Average: 20 km/l");
    }

    void model() {
        System.out.println("Model: Maruti");
    }
}

class Santro extends AbstractCar {
    void avg() {
        System.out.println("Average: 18 km/l");
    }

    void model() {
        System.out.println("Model: Santro");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractCar c = null;

        int choice;
        while (true) {
            System.out.println("1. Maruti\n2. Santro");
            System.out.print("Choose car: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice == 1 || choice == 2)
                    break;
            } else {
                sc.next();
            }
            System.out.println("Invalid choice!");
        }

        if (choice == 1)
            c = new Maruti();
        else
            c = new Santro();

        c.fuelType();
        c.avg();
        c.model();

        sc.close();
    }
}