public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        CartItem cartItem1 = new CartItem("Blah", 10, 99.9);
        CartItem cartItem2 = new CartItem("Blue", 5, 99.9);
        CartItem cartItem3 = new CartItem("Black", 10, 199.9);

        cart.addItem(cartItem1);
        cart.addItem(cartItem2);
        cart.addItem(cartItem3);

        System.out.println(cart.getTotal());
    }
}