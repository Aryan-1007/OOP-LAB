package LAB_4;

public class Client {

    public static int[] processArray(int[] arr) {
        Half h = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            result[i] = h.evaluate(arr[i]);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int[] res = processArray(arr);

        for (int i : res)
            System.out.print(i + " ");
    }
}
