package LAB_3;

class x {
    int a, b;

    x(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int finalSum() {
        return a + b;
    }
}

class y extends x {

    y(int a, int b) {
        super(a, b);
    }

    int finalDifference() {
        return a - b;
    }
}

class z extends y {
    z(int a, int b) {
        super(a, b);
    }

    int findProduct() {
        return a * b;
    }
}

public class q3 {
    public static void main(String[] args) {
        z obj = new z(5, 4);
        System.out.println("Sum = " + obj.finalSum());
        System.out.println("Difference = " + obj.finalDifference());
        System.out.println("Product = " + obj.findProduct());
    }
}
