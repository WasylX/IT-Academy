package by.it.academy.task1;

public class Student extends Person {
    private int yearOfStudy;

    public Student(String name, int age, String gender, double weight, int yearOfStudy) {
        super(name, age, gender, weight);
        this.yearOfStudy = yearOfStudy;
    }

    // Методы задания и увеличения года обучения
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    // Геттер для получения года обучения
    public int getYearOfStudy() {
        return yearOfStudy;
    }
}

