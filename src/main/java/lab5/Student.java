package lab5;

import static java.lang.IO.println;

public class Student extends Person {
    private final String studentId;
    private double averageGrade;

    public Student(String name, int age, String email, String studentId, double averageGrade) {
        super(name, age, email);
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public void upgradeGrade(double newGrade) {
        averageGrade = (averageGrade + newGrade) / 2;
    }

    public boolean isExcellentStudent() {
        return averageGrade >= 90;
    }

    @Override
    public void displayInfo() {
        println("Студент:");
        super.displayInfo();
        println("Id: %s\nСередній бал: %s\n".formatted(studentId, averageGrade));
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
