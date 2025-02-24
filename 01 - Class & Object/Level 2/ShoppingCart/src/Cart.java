import java.util.ArrayList;

public class Cart {
    private final ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }
    public void removeItem(CartItem item) {
        items.remove(item);
    }
    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
