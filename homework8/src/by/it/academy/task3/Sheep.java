package by.it.academy.task3;

class Sheep extends DomesticAnimal {

    public static final String PRODUCT_NAME = "Шерсть";
    public static final String PRODUCT_UNIT = "Килограмм";

    public Sheep() {
        super("Овцы", 7 * 4);
    }

    public String getProductName() {
        return PRODUCT_NAME;
    }

    public String getProductUnit() {
        return PRODUCT_UNIT;
    }
}

