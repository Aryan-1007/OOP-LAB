package com.LAB_3.figPackage;

public class Cone extends Figure {
    double h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = pi * r * (r + h);
    }

    public void calcVolume() {
        v = pi * r * r * h / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cone Volume = " + v);
    }
}
