package LAB_2;

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(10, 5, 2025);
        date.displayDate();
    }
}
