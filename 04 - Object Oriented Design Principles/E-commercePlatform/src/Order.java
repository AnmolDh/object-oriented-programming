import java.util.ArrayList;

public class Order {
    private Customer customer;
    private final ArrayList<Product> product;

    public Order(Customer customer) {
        this.product = new ArrayList<>();
        this.customer = customer;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }
    public void addProduct(Product product) {
        this.product.add(product);
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
