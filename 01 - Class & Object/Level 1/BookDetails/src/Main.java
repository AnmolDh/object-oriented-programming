import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Book: ");
        String name = sc.nextLine();
        System.out.print("Enter the author of Book: ");
        String author = sc.nextLine();
        System.out.print("Enter the price of Book: ");
        double price = sc.nextDouble();

        Book book = new Book(name, author, price);
        book.display();
    }
}