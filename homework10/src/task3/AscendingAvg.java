package task3;

import java.util.Comparator;

public class AscendingAvg implements Comparator<Student> {
    private final Subject subject;

     AscendingAvg(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int compare(Student student1, Student student2) {
        double average1 = student1.getAverageGradeForSubject(subject);
        double average2 = student2.getAverageGradeForSubject(subject);
        return Double.compare(average1, average2);
    }
}

