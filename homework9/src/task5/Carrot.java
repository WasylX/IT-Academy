package task5;

class Carrot extends Food {
    Carrot() {
        super("Carrot");
    }

    @Override
    FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }
}

