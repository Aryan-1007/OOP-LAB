package LAB_7;

class Teacher {
    protected String name;
    protected String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Teacher {
    private int rollNo;

    public Student(String name, String subject, int rollNo) {
        super(name, subject);
        if (rollNo <= 0)
            throw new IllegalArgumentException("Invalid Roll Number");
        this.rollNo = rollNo;
    }

    public void displayStudent() {
        displayTeacher();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Q4 {
    public static void main(String[] args) {
        try {
            Student s = new Student("Rahul", "Math", 10);
            s.displayStudent();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
