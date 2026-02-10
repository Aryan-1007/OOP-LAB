package LAB_4;

import java.util.Scanner;

public class Client {

    public static int[] processArray(int[] arr) {
        Half h = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            result[i] = h.evaluate(arr[i]);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        int[] res = processArray(arr);

        for (int i : res)
            System.out.print(i + " ");
    }
}
