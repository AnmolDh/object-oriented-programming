import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private final ArrayList<Order> orders;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void placeOrder(Product[] products) {
        Order newOrder = new Order(this);
        for (Product p : products) {
            newOrder.addProduct(p);
        }
        orders.add(newOrder);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Products: ");
        for (Order o : orders) {
            for (Product p : o.getProduct()){
                System.out.println(p.getProductName());
            }
        }
    }
}
