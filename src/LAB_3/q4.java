package LAB_3;

import com.LAB_3.figPackage.Cone;
import com.LAB_3.figPackage.Cylinder;
import com.LAB_3.figPackage.Sphere;

public class q4 {
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
