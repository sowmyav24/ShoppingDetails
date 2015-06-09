public class ItemDetails {
    private int quantity;
    private String itemName;
    private double price;

    ItemDetails(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    public String returnDetails() {
        return this.quantity+this.itemName+this.price;
    }
}
