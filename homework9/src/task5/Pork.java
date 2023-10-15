package task5;

class Pork extends Food {
    Pork() {
        super("Pork");
    }

    @Override
    FoodType getFoodType() {
        return FoodType.MEAT;
    }
}

