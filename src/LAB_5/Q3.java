package LAB_5;

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
        ElectricalProduct ep =
                new ElectricalProduct(1, "Heater", 101, 2500, "220V", 2000);

        ep.update("110-220V", 2700);
        ep.display();
    }
}
