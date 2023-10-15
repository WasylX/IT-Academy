package task5;

public abstract class Food {
    private String name;

    Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract FoodType getFoodType();
}

