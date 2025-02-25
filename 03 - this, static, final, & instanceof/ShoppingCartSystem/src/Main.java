public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1200, 2);
        Product prod2 = new Product(102, "Smartphone", 800, 5);

        prod1.displayProductDetails();
        prod2.displayProductDetails();
        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");

    }
}