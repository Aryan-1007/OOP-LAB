package com.LAB3;

public class Sphere1 extends Figure1 {
    public Sphere1(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVolume() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Sphere Volume = " + v);
    }
}
