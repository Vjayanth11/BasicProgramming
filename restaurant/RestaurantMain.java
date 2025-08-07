package objectorientation.restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        FoodItem item1 = new Biryani("Hyderabadi Biryani", 220, 30, "Basmati Rice, Chicken, Spices");
        FoodItem item2 = new Dosa("Masala Dosa", 90, 10, "Rice Batter, Potato Masala, Chutney");
        FoodItem item3 = new PaneerButterMasala("Paneer Butter Masala", 160, 15, "Paneer, Butter, Cream, Tomato");

        orderItem(item1);
        orderItem(item2);
        orderItem(item3);
    }

    public static void orderItem(FoodItem item) {
        System.out.println("Ordering: " + item.getName());
        System.out.println("Cost: " + item.getCost());
        System.out.println("Preparation Time: " + item.getPreparationTime() + " mins");
        System.out.println("Ingredients: " + item.getIngredients());
        System.out.println("---------------------------");
    }
}

