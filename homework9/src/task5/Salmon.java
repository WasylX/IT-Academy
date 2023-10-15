package task5;

class Salmon extends Food {
    Salmon() {
        super("Salmon");
    }

    @Override
    FoodType getFoodType() {
        return FoodType.FISH;
    }
}

