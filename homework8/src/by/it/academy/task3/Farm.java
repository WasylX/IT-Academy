package by.it.academy.task3;

class Farm {
    private final DomesticAnimal[] animals;
    private int count;

    public Farm(int capacity) {
        animals = new DomesticAnimal[capacity];
        count = 0;
    }

    public void addAnimal(DomesticAnimal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        } else {
            System.out.println("Хозяйство переполнено, невозможно добавить больше животных.");
        }
    }

    public void printProducts() {
        for (int i = 0; i < count; i++) {
            DomesticAnimal animal = animals[i];
            System.out.println("Животное: " + animal.getName());
            System.out.println("Продукт: " + animal.getProductName());
            System.out.println("Единица измерения: " + animal.getProductUnit());
            System.out.println("Количество продукции в неделю: " + animal.getProductPerWeek() + " "
                    + animal.getProductUnit());
            System.out.println("Количество продукции в месяц: " + animal.getProductPerWeek() * 4 + " "
                    + animal.getProductUnit());
            System.out.println("Количество продукции в год: " + animal.getProductPerWeek() * 4 * 12 + " "
                    + animal.getProductUnit());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm(5);

        farm.addAnimal(new Chicken());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Goose());
        farm.addAnimal(new Cow());
        farm.addAnimal(new Sheep());

        farm.printProducts();
    }
}

