package LAB_5;

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
        Fruit f1 = new Fruit("Apple", "Single", 120);
        Fruit f2 = new Fruit("Grapes", "Bunch", 80);
        f1.displayFruit();
        f2.displayFruit();
    }
}
