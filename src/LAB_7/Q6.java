package LAB_7;

class Course {
    private int id;
    private String description;
    private int duration;
    private double fees;

    public Course(int id, String description, int duration, double fees) {
        if (fees < 0 || duration <= 0)
            throw new IllegalArgumentException("Invalid course details");

        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    public void getData() {
        System.out.println(id + " | " + description + " | " + duration + " months | " + fees);
    }
}

public class Q6 {
    public static void main(String[] args) {
        try {
            Course[] courses = {
                    new Course(1, "Java", 6, 15000),
                    new Course(2, "Python", 5, 12000),
                    new Course(3, "C++", 4, 10000),
                    new Course(4, "Web Dev", 3, 8000),
                    new Course(5, "AI", 6, 20000)
            };

            for (Course c : courses)
                c.getData();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
