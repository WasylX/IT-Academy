package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    public String name;
    public Map<Subject, List<Mark>> gradesBySubjects;

    public Student(String name) {
        this.name = name;
        this.gradesBySubjects = new HashMap<>();
    }

    public void addGrade(Subject subject, int value) {
        gradesBySubjects.computeIfAbsent(subject, k -> new ArrayList<>()).add(new Mark(value));
    }

    public double getAverageGrade() {
        int total = 0;
        int count = 0;
        for (List<Mark> marks : gradesBySubjects.values()) {
            for (Mark mark : marks) {
                total += mark.getValue();
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) total / count;
    }

    public double getAverageGradeForSubject(Subject subject) {
        List<Mark> marks = gradesBySubjects.get(subject);
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Mark mark : marks) {
            total += mark.getValue();
        }

        return total / marks.size();
    }

    public Map<Subject, Map<Integer, Integer>> getGradeStatistics() {
        Map<Subject, Map<Integer, Integer>> statistics = new HashMap<>();

        for (Subject subject : gradesBySubjects.keySet()) {
            List<Mark> marks = gradesBySubjects.get(subject);
            Map<Integer, Integer> gradeCount = new HashMap<>();

            for (Mark mark : marks) {
                gradeCount.put(mark.getValue(), gradeCount.getOrDefault(mark.getValue(), 0) + 1);
            }

            statistics.put(subject, gradeCount);
        }

        return statistics;
    }
}

