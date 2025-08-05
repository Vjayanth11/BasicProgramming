package objectorientd.InventoryMangement;

public class InventorySystem {
    public void run() {
        Warehouse warehouse = new Warehouse(5);

        Product p1 = new Product(101, "Pen", 10.5, 100);
        Product p2 = new Product(102, "Notebook", 45.0, 50);
        Product p3 = new Product(103, "Pencil", 5.0, 200);

        warehouse.addProduct(p1);
        warehouse.addProduct(p2);
        warehouse.addProduct(p3);

        Order order1 = new Order(101, 10);
        Order order2 = new Order(104, 5);
        Order order3 = new Order(102, 60);

        order1.process(warehouse);
        order2.process(warehouse);
        order3.process(warehouse);

        System.out.println("\nInventory Status:");
        warehouse.showInventory();
    }
}

