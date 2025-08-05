package objectorientd.InventoryMangement;

public class Warehouse {
    private Product[] products;
    private int count;

    public Warehouse(int capacity) {
        products = new Product[capacity];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Warehouse full");
        }
    }

    public Product getProductById(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                return products[i];
            }
        }
        return null;
    }

    public void showInventory() {
        for (int i = 0; i < count; i++) {
            products[i].display();
        }
    }
}

