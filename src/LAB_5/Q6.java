package LAB_5;

import java.util.Scanner;

class Student {
    String name;

    String inputName(String n) {
        name = n;
        return name;
    }

    String average(int m1, int m2, int m3) {
        int avg = (m1 + m2 + m3) / 3;
        return avg >= 50 ? "Passed" : "Failed";
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student s = new Student();
        String name;
        int mark1, mark2, mark3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name=input.nextLine();
        System.out.println("Enter Student Mark: ");
        mark1=input.nextInt();
        mark2=input.nextInt();
        mark3=input.nextInt();
        System.out.println("Result: " + s.average(mark1, mark2, mark3));
        input.close();
    }
}
