package objectorientation.restaurant;

public class Dosa implements FoodItem {
    private String name;
    private int cost;
    private int preparationTime;
    private String ingredients;

    public Dosa(String name, int cost, int preparationTime, String ingredients) {
        this.name = name;
        this.cost = cost;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public String getIngredients() {
        return ingredients;
    }
}

