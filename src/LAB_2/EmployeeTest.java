package LAB_2;

class Employee {
    String firstName;
    String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary > 0 ? monthlySalary : 0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary += monthlySalary * 0.10;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 30000);
        Employee emp2 = new Employee("Jane", "Smith", 40000);

        System.out.println("Yearly Salary (Before Raise):");
        System.out.println("Salary of " + emp1.firstName + " " + emp1.lastName + "is");
        System.out.println(emp1.getYearlySalary());
        System.out.println("Salary of " + emp2.firstName + " " + emp2.lastName + "is");
        System.out.println(emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("Yearly Salary (After 10% Raise):");
        System.out.println("Salary of " + emp1.firstName + " " + emp1.lastName + "is");
        System.out.println(emp1.getYearlySalary());
        System.out.println("Salary of " + emp2.firstName + " " + emp2.lastName + "is");
        System.out.println(emp2.getYearlySalary());
    }
}
