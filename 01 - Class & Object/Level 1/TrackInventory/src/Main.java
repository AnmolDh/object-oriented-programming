import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the code of item: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of item: ");
        String name = sc.nextLine();
        System.out.print("Enter the price of item: ");
        double price = sc.nextDouble();

        Item item = new Item(code, name, price);
        item.displayItem();
        System.out.println("Total price for quantity of 10 is: " + item.getTotalCost(10));
    }
}