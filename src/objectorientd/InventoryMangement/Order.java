package objectorientd.InventoryMangement;

public class Order {
    private int productId;
    private int quantity;

    public Order(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public void process(Warehouse warehouse) {
        Product product = warehouse.getProductById(productId);
        if (product != null) {
            if (product.getQuantity() >= quantity) {
                product.reduceQuantity(quantity);
                System.out.println("Order Confirmed: Product ID " + productId + " Qty " + quantity);
            } else {
                System.out.println("Out of stock for Product ID " + productId);
            }
        } else {
            System.out.println("Product ID " + productId + " not found");
        }
    }
}

