package LAB_5;

//import static LAB_5.Tax.calculateNetPay;

class Tax {
    static double calculateTax(double grossPay) {
        return grossPay * 0.15;
    }

    static double calculateNetPay(int hoursWorked) {
        double gross = hoursWorked * 12;
        return gross - calculateTax(gross);
    }
}
public class Q5 {
    public static void main(String[] args) {
        int hours = 40;
        System.out.println("Net Pay: $" + Tax.calculateNetPay(hours));
    }
}
