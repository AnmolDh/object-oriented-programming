public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 19.9);
        Product p2 = new Product("P2", 29.9);

        p1.displayProductDetails();

        Product.displayTotalProducts();
    }
}