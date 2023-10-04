package by.it.academy.e_shop;

class User {
    private String username;
    private String password;
    private Cart cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new Cart();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

