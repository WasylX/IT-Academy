package task5;

class Beef extends Food {
    Beef() {
        super("Beef");
    }

    @Override
    FoodType getFoodType() {
        return FoodType.MEAT;
    }
}

