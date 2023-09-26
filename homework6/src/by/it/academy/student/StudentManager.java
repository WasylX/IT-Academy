package by.it.academy.student;

import java.util.Arrays;

public class StudentManager {
    private final Student[] students;
    private int size;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        } else {
            System.out.println("Ошибка: Превышено максимальное количество студентов.");
        }
    }

    public Student[] getStudentsByFaculty(String faculty) {
        Student[] result = new Student[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                result[count] = students[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Student[] getStudentsByFacultyAndCourse() {
        return Arrays.copyOf(students, size);
    }

    public Student[] getStudentsBornAfterYear(String year) {
        Student[] result = new Student[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            String[] birthDateParts = students[i].getBirthDate().split("\\.");
            if (birthDateParts.length == 3) {
                int studentBirthYear = Integer.parseInt(birthDateParts[2]);
                if (studentBirthYear > Integer.parseInt(year)) {
                    result[count] = students[i];
                    count++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Student[] getStudentsByGroup(String group) {
        Student[] result = new Student[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getGroup().equals(group)) {
                result[count] = students[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}

