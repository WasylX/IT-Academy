package task1;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;


    public Animal() {
        this.name = "Толик";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

