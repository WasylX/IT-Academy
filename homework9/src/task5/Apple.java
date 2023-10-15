package task5;

class Apple extends Food {
    Apple() {
        super("Apple");
    }

    @Override
    FoodType getFoodType() {
        return FoodType.FRUIT;
    }
}

