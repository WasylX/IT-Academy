package by.it.academy.e_shop;

class Cart {
    private Product[] items;

    public Cart() {
        this.items = new Product[0];
    }

    public void addProduct(Product product) {
        for (Product item : items) {
            if (item.getName().equals(product.getName())) {
                // Если товар уже есть в корзине, увеличиваем количество
                return;
            }
        }
        Product[] newItems = new Product[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[items.length] = product;
        items = newItems;
    }

    public Product[] getItems() {
        return items;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }
}

