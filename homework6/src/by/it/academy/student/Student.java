package by.it.academy.student;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, String middleName, String birthDate,
                   String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nФамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + middleName +
                "\nДата рождения: " + birthDate + "\nАдрес: " + address +
                "\nТелефон: " + phoneNumber + "\nФакультет#: " + faculty + "\nКурс#: " + course + "\nГруппа#: " +
                group + "\n";
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGroup() {
        return group;
    }
}

