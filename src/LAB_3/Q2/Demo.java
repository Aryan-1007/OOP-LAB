package LAB_3.Q2;

abstract class Figure {
    double pi = 3.142;

    public abstract void calcArea();

    public abstract void calcVol();

    public abstract void dispArea();

    public abstract void dispVol();
}

class Sphere extends Figure {
    double r, area, vol;

    Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        area = 4 * pi * r * r;
    }

    public void calcVol() {
        vol = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + area);
    }

    public void dispVol() {
        System.out.println("Sphere Volume = " + vol);
    }
}

class Cylinder extends Figure {
    double r, h, area, vol;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        area = 2 * pi * r * (r + h);
    }

    public void calcVol() {
        vol = pi * r * r * h;
    }

    public void dispArea() {
        System.out.println("Cylinder Area = " + area);
    }

    public void dispVol() {
        System.out.println("Cylinder Volume = " + vol);
    }
}

public class Demo {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        s.calcArea();
        s.calcVol();
        s.dispArea();
        s.dispVol();

        Cylinder c = new Cylinder(4, 6);
        c.calcArea();
        c.calcVol();
        c.dispArea();
        c.dispVol();
    }
}
