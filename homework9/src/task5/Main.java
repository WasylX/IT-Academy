package task5;

public class Main {
    public static void main(String[] args) {
        Food vegetable = new Vegetable("Carrot");
        Food meat = new Meat("Beef");
        Food fish = new Fish("Salmon");

        Food[] foods = {vegetable, meat, fish};

        FoodChecker checker = new FoodChecker();
        boolean isAllVegetarian = checker.isVegetarian(foods);

        System.out.println("Все ли ингредиенты вегетарианские: " + isAllVegetarian);
    }
}

