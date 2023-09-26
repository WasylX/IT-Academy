package by.it.academy.e_shop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.99, 4.5);
        Product product2 = new Product("Product 2", 7.99, 3.4);
        Product product3 = new Product("Product 3", 14.99, 4.5);
        Product product4 = new Product("Product 4", 25.99, 5.0);

        Category category1 = new Category("Category 1", new Product[]{product1, product2});
        Category category2 = new Category("Category 2", new Product[]{product3, product4});

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");

        // Добавляем продукты в корзину пользователей
        user1.getCart().addProduct(product1);
        user1.getCart().addProduct(product2);
        user2.getCart().addProduct(product3);
        user2.getCart().addProduct(product4);
        user3.getCart().addProduct(product3);
        user3.getCart().addProduct(product2);

        System.out.println("Каталог продуктов:");
        for (Category category : new Category[]{category1, category2}) {
            System.out.println(category.getName());
            for (Product product : category.getProducts()) {
                System.out.println("- " + product.getName() + ", " + "Price: ($" + product.getPrice() + ")" +
                        ", " + "Rating: (☆ " +product.getRating() + ")");
            }
        }

        System.out.println("\nПокупки пользователей:");
        for (User user : new User[]{user1, user2, user3}) {
            System.out.println(user.getUsername() + "'s Cart:");
            for (Product product : user.getCart().getItems()) {
                System.out.println("- " + product.getName());
            }
        }
    }
}

