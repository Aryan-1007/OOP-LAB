package LAB_5;

import java.util.Scanner;

import static java.lang.Math.abs;

class Fruit {
    String name;
    String type;
    double price;

    Fruit(String n, String t, double p) {
        name = n;
        type = t;
        price = p;
    }

    void displayFruit() {
        System.out.println(name + " " + type + " " + price);
    }
}
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of first fruit: ");
        String name1 = sc.nextLine();

        System.out.print("Enter type of first fruit: ");
        String type1 = sc.nextLine();

        System.out.print("Enter price of first fruit: ");
        int price1 = sc.nextInt();
        sc.nextLine();
        price1=abs(price1);

        Fruit f1 = new Fruit(name1, type1, price1);

        System.out.println("\nFruit Details:");
        f1.displayFruit();

        sc.close();
    }
}
