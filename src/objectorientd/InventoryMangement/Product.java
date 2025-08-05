package objectorientd.InventoryMangement;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
        }
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Price: " + price + " Qty: " + quantity);
    }
}

