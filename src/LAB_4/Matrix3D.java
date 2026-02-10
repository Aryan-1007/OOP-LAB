package LAB_4;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix3D {
    static int X = 3, Y = 3, Z = 3;

    public static void set(int value, int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        arr[index] = value;
    }

    public static int get(int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        if(x<0 || y<0 || z<0){
            System.out.println("incorrect input");
            return -1;
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[X * Y * Z];
        System.out.println("Enter the element of the matrix along with (X,Y,Z) cooordiantes");
        int ele,x,y,z;
        Scanner sc = new Scanner(System.in);
        ele = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        set(ele, x, y, z, arr);
        System.out.println(get(x, y, z, arr));
    }
}
