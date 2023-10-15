package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Subject math = new Subject("Математика");
        Subject language = new Subject("Язык");
        Subject physics = new Subject("Физика");

        for (int i = 1; i <= 10; i++) {
            Student student = new Student("Ученик " + i);

            int[] mathGrades = generateRandomGrades();
            int[] languageGrades = generateRandomGrades();
            int[] physicsGrades = generateRandomGrades();

            for (int j = 0; j < 3; j++) {
                student.addGrade(math, mathGrades[j]);
                student.addGrade(language, languageGrades[j]);
                student.addGrade(physics, physicsGrades[j]);
            }

            students.add(student);
        }

        System.out.println("Вывод статистики: ");
        for (Student student : students) {
            System.out.println("-------------------------------");
            System.out.println(student.name);

            for (Map.Entry<Subject, Map<Integer, Integer>> entry : student.getGradeStatistics().entrySet()) {
                Subject subject = entry.getKey();
                Map<Integer, Integer> gradeCount = entry.getValue();

                System.out.print(subject.name + " {");

                for (Map.Entry<Integer, Integer> gradeEntry : gradeCount.entrySet()) {
                    System.out.print(gradeEntry.getKey() + " - " + gradeEntry.getValue() + ", ");
                }
                System.out.println("}");
            }
        }

        System.out.println("------------------------------------");

        sortByAverageGrade(students, math, false);
        System.out.println("Сортировка по средней оценке по математике в порядке убывания:");
        students.forEach(student -> System.out.println(student.name));

        sortByAverageGrade(students, language, true);
        System.out.println("\nСортировка по средней оценке по языку в порядке возрастания:");
        students.forEach(student -> System.out.println(student.name));

        List<Student> bestStudents = getBestStudents(students);
        List<Student> worstStudents = getWorstStudents(students);

        System.out.println("-------------------------------");
        System.out.println("Лучшие студенты по средней оценке:");
        bestStudents.forEach(student -> System.out.println(student.name + " - " + student.getAverageGrade()));

        System.out.println("\nХудшие студенты по средней оценке:");
        worstStudents.forEach(student -> System.out.println(student.name + " - " + student.getAverageGrade()));
    }

    private static int[] generateRandomGrades() {
        int[] grades = new int[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            grades[i] = random.nextInt(4) + 2;
        }
        return grades;
    }

    public static void sortByAverageGrade(List<Student> students, Subject subject, boolean ascending) {
        Comparator<Student> comparator;

        if (ascending) {
            comparator = new AscendingAvg(subject);
        } else {
            comparator = new DescendingAvg(subject);
        }

        students.sort(comparator);
    }

    public static List<Student> getBestStudents(List<Student> students) {
        List<Student> bestStudents = new ArrayList<>();
        double bestAverage = students.get(0).getAverageGrade();

        for (Student student : students) {
            if (student.getAverageGrade() == bestAverage) {
                bestStudents.add(student);
            }
        }

        return bestStudents;
    }

    public static List<Student> getWorstStudents(List<Student> students) {
        List<Student> worstStudents = new ArrayList<>();
        double worstAverage = students.get(students.size() - 1).getAverageGrade();

        for (Student student : students) {
            if (student.getAverageGrade() == worstAverage) {
                worstStudents.add(student);
            }
        }

        return worstStudents;
    }
}

