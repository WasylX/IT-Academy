package task5;


public class Main {
    public static void main(String[] args) {
        Food beef = new Beef();
        Food pork = new Pork();
        Food salmon = new Salmon();
        Food carrot = new Carrot();
        Food apple = new Apple();

        Food[] foods = {beef, pork, salmon,carrot, apple};

        FoodChecker checker = new FoodChecker();
        boolean isAllVegetarian = checker.isVegetarian(foods);

        System.out.println("Все ли ингредиенты вегетарианские: " + isAllVegetarian);
    }
}

