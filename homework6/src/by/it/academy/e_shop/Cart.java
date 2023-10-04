package by.it.academy.e_shop;

class Cart {
    private CartItem[] items;

    public Cart() {
        this.items = new CartItem[0];
    }

    public void addProduct(Product product) {
        for (CartItem cartItem : items) {
            if (cartItem.getProduct().getName().equals(product.getName())) {
                // Если товар уже есть в корзине, увеличиваем количество
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                return;
            }
        }
        CartItem[] newItems = new CartItem[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = new CartItem(product, 1);
        items = newItems;
    }

    public CartItem[] getItems() {
        return items;
    }
}

