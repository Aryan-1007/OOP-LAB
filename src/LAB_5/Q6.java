package LAB_5;
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
        System.out.println("Name: " + s.inputName("Rahul"));
        System.out.println("Result: " + s.average(60, 55, 40));
    }
}
