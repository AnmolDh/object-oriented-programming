public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemCode() {
        return itemCode;
    }
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }
}
