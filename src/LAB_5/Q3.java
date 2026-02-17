package LAB_5;

import java.util.Scanner;
import static java.lang.Math.abs;

class Product {
    int productId;
    String name;
    int categoryId;
    double unitPrice;

    Product(int pid, String n, int cid, double price) {
        productId = pid;
        name = n;
        categoryId = cid;
        unitPrice = price;
    }
}

class ElectricalProduct extends Product {
    String voltageRange;
    int wattage;

    ElectricalProduct(int pid, String n, int cid, double price,
                      String voltage, int watt) {
        super(pid, n, cid, price);
        voltageRange = voltage;
        wattage = watt;
    }

    void update(String voltage, double price) {
        voltageRange = voltage;
        unitPrice = price;
    }

    void display() {
        System.out.println(productId + " " + name + " " + categoryId +
                " " + unitPrice + " " + voltageRange + " " + wattage);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Code: ");
        int code = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Voltage: ");
        String voltage = sc.nextLine();

        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        price=abs(price);
        power=abs(power);

        ElectricalProduct ep =
                new ElectricalProduct(id, name, code, price, voltage, power);

        sc.nextLine();
        System.out.print("\nEnter New Voltage: ");
        String newVoltage = sc.nextLine();

        System.out.print("Enter New Power: ");
        int newPower = sc.nextInt();

        ep.update(newVoltage, newPower);

        System.out.println("\nUpdated Product Details:");
        ep.display();

        sc.close();
    }
}
