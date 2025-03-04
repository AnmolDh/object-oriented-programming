public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 100);
        Product p2 = new Product("P2", 200);
        Product p3 = new Product("P3", 300);

        Customer customer = new Customer("Harry", "NA", "990101");

        customer.placeOrder(new Product[] { p1, p3 });

        customer.displayDetails();
    }
}