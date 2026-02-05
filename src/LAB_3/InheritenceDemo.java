package LAB_3;

class Figure {
    double r, v;

    public void dispArea() {
    }

    public void dispVolume() {
    }
}

class Cone extends Figure {

    public Cone(double r, double v) {
        this.r = r;
        this.v = v;
    }

    public double calcArea() {
        return Math.PI * r * (r + v);
    }

    public double calcVolume() {
        return Math.PI * r * r * v / 3;
    }

    public void dispArea() {
        System.out.println("Area of Cone = " + calcArea());
    }

    public void dispVolume() {
        System.out.println("Volume of Cone = " + calcVolume());
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {
        Cone c = new Cone(5, 10);
        c.dispArea();
        c.dispVolume();
    }
}
