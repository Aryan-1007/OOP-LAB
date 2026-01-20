class Figure {
    double r, a, v;

    public void dispaArea() {
        System.out.println("Area of figure is " + a);
    }

    public void dispVolume() {
        System.out.println("Volume of figure is " + v);
    }
}

class Cone extends Figure {
    public void calArea() {
        r = radius;
        a = 3.14 * r * slantHeight;
    }

    public void calVolume() {
        r = radius;
        v = (1.0 / 3.0) * 3.14 * r * r * height;
    }

}

public class InheritenceDemo {

}
