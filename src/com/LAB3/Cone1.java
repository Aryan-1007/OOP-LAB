package com.LAB3;

public class Cone1 extends Figure1 {
    double h;

    public Cone1(double r, double h) {
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
