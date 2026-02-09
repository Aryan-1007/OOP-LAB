package LAB_3;

import com.LAB3.*;

public class q4 {
    public static void main(String[] args) {

        Cone1 c = new Cone1(3, 7);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        Sphere1 s = new Sphere1(5);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        Cylinder1 cy = new Cylinder1(4, 6);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}

