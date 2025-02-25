public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Metamorphosis", "Franz Kafka");
        Book book2 = new Book("978-0-262-13472-9", "Letter to ...", "Franz Kafka");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();

    }
}