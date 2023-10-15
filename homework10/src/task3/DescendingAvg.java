package task3;

import java.util.Comparator;

public class DescendingAvg implements Comparator<Student> {
    private Subject subject;

    public DescendingAvg(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int compare(Student student1, Student student2) {
        double average1 = student1.getAverageGradeForSubject(subject);
        double average2 = student2.getAverageGradeForSubject(subject);
        return Double.compare(average2, average1);
    }
}

