public class Main {
    public static void main(String[] args) {
        Book book = new Book("hello", "hitler", 199.89, 1);

        book.borrowBook();
        book.returnBook();

        book.displayBook();
    }
}