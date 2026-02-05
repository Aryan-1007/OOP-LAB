package LAB_3.Q4;

import LAB_3.Q4.figPackage.*;

public class Demo {
    public static void main(String[] args) {

        Cone c = new Cone(3, 7);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        Sphere s = new Sphere(5);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        Cylinder cy = new Cylinder(4, 6);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}
