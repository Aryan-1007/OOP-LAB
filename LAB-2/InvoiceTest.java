class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity > 0 ? quantity : 0;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0.0;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("P101", "Mouse", 2, 500.0);
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
