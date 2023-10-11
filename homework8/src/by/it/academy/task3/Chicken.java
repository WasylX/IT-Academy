package by.it.academy.task3;

class Chicken extends DomesticAnimal {

    public static final String PRODUCT_NAME = "Яйца";
    public static final String PRODUCT_UNIT = "Штука";

    public Chicken() {
        super("Куры", 7);
    }

    public String getProductName() {
        return PRODUCT_NAME;
    }

    public String getProductUnit() {
        return PRODUCT_UNIT;
    }
}

