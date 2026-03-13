package LAB_7;

class Book {
    protected int bookID;
    protected String title;
    protected String author;
    protected double price;

    public Book(int bookID, String title, String author, double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");

        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book {
    private String period;

    public Periodical(int bookID, String title, String author, double price, String period) {
        super(bookID, title, author, price);
        this.period = period;
    }

    public void updateDetails(double newPrice, String newPeriod) {
        if (newPrice < 0)
            throw new IllegalArgumentException("Invalid price");

        this.price = newPrice;
        this.period = newPeriod;
    }

    public void display() {
        System.out.println("ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Period: " + period);
    }
}

public class    Q3 {
    public static void main(String[] args) {
        try {
            Periodical p = new Periodical(1, "Science Today", "John", 500, "Monthly");
            p.updateDetails(600, "Weekly");
            p.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
