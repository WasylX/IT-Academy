package task5;

public class FoodChecker {
    public boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (food.getFoodType() != FoodType.VEGETABLE && food.getFoodType() != FoodType.FRUIT) {
                return false;
            }
        }
        return true;
    }
}

