package task5;

enum FoodType {
    MEAT,
    FISH,
    FRUIT,
    VEGETABLE,
    MILK,
    UNKNOWN;

    public boolean isVegetarian() {
        return this == VEGETABLE || this == FRUIT || this == MILK;
    }
}

