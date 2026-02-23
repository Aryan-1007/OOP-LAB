package LAB_6;

import java.util.Scanner;
import com.LAB6.WashingMachine;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();

        wm.switchOn();

        int clothes;
        while (true) {
            System.out.print("Enter number of clothes (1-20): ");
            if (sc.hasNextInt()) {
                clothes = sc.nextInt();
                if (clothes > 0 && clothes <= 20)
                    break;
            } else {
                sc.next();
            }
            System.out.println("Invalid input! Enter between 1 and 20.");
        }

        System.out.println("Clothes accepted: " + wm.acceptClothes(clothes));
        wm.acceptDetergent();
        wm.switchOff();

        sc.close();
    }
}