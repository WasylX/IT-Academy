package task5;

class Fish extends Food {
    public Fish(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FISH;
    }
}

