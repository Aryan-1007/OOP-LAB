package LAB_4.q1;

public class Matrix3D {
    static int X = 3, Y = 3, Z = 3;

    public static void set(int value, int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        arr[index] = value;
    }

    public static int get(int x, int y, int z, int[] arr) {
        int index = x * (Y * Z) + y * Z + z;
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[X * Y * Z];
        set(10, 1, 1, 1, arr);
        System.out.println(get(1, 1, 1, arr));
    }
}
