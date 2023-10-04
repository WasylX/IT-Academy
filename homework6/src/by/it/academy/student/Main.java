package by.it.academy.student;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager(100);
        manager.addStudent(new Student(1,
                "Карпачёв",
                "Инокентий",
                "Иванович",
                "15.05.2000",
                "ул. Эдисона, 123",
                "111-11-11",
                "Факультет#1",
                2,
                "Группа#1"));
        manager.addStudent(new Student(2,
                "Сараев",
                "Поджог",
                "Петрович",
                "15.08.1999",
                "ул. Фарадея, 456",
                "222-22-22",
                "Факультет#2",
                3,
                "Группа#2"));
        manager.addStudent(new Student(3,
                "Устоев",
                "Подрыв",
                "Александрович",
                "13.08.2001",
                "ул. Эйнштейна, 789",
                "333-33-33",
                "Факультет#1",
                2,
                "Группа#3"));

        String facultyToFind = "Факультет#1";
        Student[] studentsByFaculty = manager.getStudentsByFaculty(facultyToFind);
        System.out.println("Список студентов факультета " + facultyToFind + ":");
        for (Student student : studentsByFaculty) {
            System.out.println(student);
        }

        facultyToFind = "Факультет#1";
        int courseToFind = 2;

        Student[] studentsByFacultyAndCourse = manager.getStudentsByFacultyAndCourse(facultyToFind, courseToFind);
        System.out.println("Список студентов факультета " + facultyToFind + " и курса " + courseToFind + ":");
        for (Student student : studentsByFacultyAndCourse) {
            System.out.println(student);
        }


        String birthYearToFind = "2000";
        Student[] studentsBornAfterYear = manager.getStudentsBornAfterYear(birthYearToFind);
        System.out.println("Список студентов, родившихся после " + birthYearToFind + " года:");
        for (Student student : studentsBornAfterYear) {
            System.out.println(student);
        }

        String groupToFind = "Группа#2";
        Student[] studentsByGroup = manager.getStudentsByGroup(groupToFind);
        System.out.println("Список студентов группы " + groupToFind + ":");
        for (Student student : studentsByGroup) {
            System.out.println(student);
        }
    }
}

