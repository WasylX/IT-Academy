package by.it.academy.task3;

abstract class DomesticAnimal {
    private final String name;
    private final int productPerWeek;

    protected DomesticAnimal(String name, int productPerWeek) {
        this.name = name;
        this.productPerWeek = productPerWeek;
    }

    public String getName() {
        return name;
    }

    public int getProductPerWeek() {
        return productPerWeek;
    }

    public abstract String getProductName();

    public abstract String getProductUnit();
}

