package LAB_6;

import java.util.Scanner;

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    double distance(LAB_6.Point3D p) {
        return Math.sqrt(
                Math.pow(p.x - x, 2) +
                        Math.pow(p.y - y, 2) +
                        Math.pow(p.z - z, 2)
        );
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, z1, x2, y2, z2;

        System.out.println("Enter coordinates for Point 1:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        z1 = sc.nextInt();

        System.out.println("Enter coordinates for Point 2:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        z2 = sc.nextInt();

        Point3D p1 = new Point3D(x1, y1, z1);
        Point3D p2 = new Point3D(x2, y2, z2);

        p1.display();
        p2.display();

        System.out.println("Distance: " + p1.distance(p2));

        sc.close();
    }
}
