public class Book {
    private String title;
    private String author;
    private double price;
    private int availability;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAvailability() {
        return availability;
    }
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Book(String title, String author, double price, int availability) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setAvailability(availability);
    }

    public void borrowBook() {
        if (getAvailability() <= 0) {
            System.out.println("You don't have enough availability");
            return;
        }
        setAvailability(getAvailability() - 1);
    }

    public void returnBook() {
        setAvailability(getAvailability() + 1);
    }

    public void displayBook() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Availability: " + getAvailability());
    }
}
